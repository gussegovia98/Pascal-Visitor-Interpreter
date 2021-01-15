import java.util.*;

public class EvalVis extends Proj2BaseVisitor<Double> {



    private HashMap<String, Double> globalScopeDouble = new HashMap<>();

    private Stack<HashMap<String, Double>> scopeStackDouble  = new Stack<>();

    private HashMap<String, Boolean> globalScopeBool = new HashMap<>();

    private Stack<HashMap<String, Boolean>> scopeStackBool  = new Stack<>();

    private HashMap<String,Proj2Parser.FunctionDeclarationContext> functions = new HashMap();

    private boolean breakBool = false;

    private boolean continueBool = false;
    Scanner scnr = new Scanner(System.in);


    /*
     *
     *
     *  functions
     *
     *
     * */

    @Override
    public Double visitMethodCalling(Proj2Parser.MethodCallingContext ctx) {
        String functionName = ctx.getChild(2).getChild(0).getText();
        String ID = ctx.getChild(0).getText();
        Double val=0.0;

        if(functions.containsKey(functionName)){
            Proj2Parser.FunctionDeclarationContext function = functions.get(functionName);//loading up correct functions
            int functionArgCount = function.getChild(2).getChildCount();
            int temp=0;
            for(int i=0;i<function.getChild(2).getChild(1).getChild(0).getChild(0).getChildCount();i++){
                if(function.getChild(2).getChild(1).getChild(0).getChild(0).getChild(i).toString().equals(",")){
                    temp++;
                }

            }
            functionArgCount-=temp;
            temp=0;
            int passingInArgCount = ctx.getChild(2).getChild(2).getChildCount();
            for(int i=0;i<ctx.getChild(2).getChild(2).getChildCount();i++){
                if(ctx.getChild(2).getChild(2).getChild(i).toString().equals(",")){
                    temp++;
                }

            }
            passingInArgCount-=temp;

            if(functionArgCount!=passingInArgCount){
                throw new RuntimeException("Wrong Arg Count");
            }


            List<Proj2Parser.ExprContext> givenArgs = ctx.methodCall().methodArguments().expr();

            HashMap<String,Double> localFunctionVars = new HashMap<>();
            int j=0;
            for(int i=0;i<functionArgCount;i++){
                localFunctionVars.put(function.getChild(2).getChild(1).getChild(0).getChild(0).getChild(j).getText(),
                        this.visit(givenArgs.get(i)));
                j+=2;
            }
            scopeStackDouble.push(localFunctionVars);

            Proj2Parser.CompoundStatementContext statementsToRun = function.block().compoundStatement();

            this.visit(statementsToRun.getChild(1));

            if(scopeStackDouble.size()!=localFunctionVars.size()){
                scopeStackDouble.pop();
                if(scopeStackDouble.isEmpty()){
                    globalScopeDouble.put(ID, globalScopeDouble.get(functionName));
                }
                else {
                    scopeStackDouble.peek().put(ID, globalScopeDouble.get(functionName));
                }
                return val;
            }
            //System.out.println("test");
        }
        else{
            System.out.println("This function has not been defined.");
        }

        return 0.0;
    }


    @Override
    public Double visitFunctionDeclaration(Proj2Parser.FunctionDeclarationContext ctx) {
        String functionName = ctx.getChild(1).getText();
        if(functions.containsKey(functionName)){
            System.out.println("There is already a function with that name.");
        }
        functions.put(functionName,ctx);

        return 1.1;
    }


    /*
     *
     *
     *  WHILE AND FOR LOOPS
     *
     *
     * */
    @Override
    public Double visitWhileStateBlock(Proj2Parser.WhileStateBlockContext ctx) {
        ctx.logicExpr();
        Double condition = this.visit(ctx.getChild(1));
        HashMap<String, Double> localScope;

        if(scopeStackDouble.isEmpty()){
            localScope = globalScopeDouble;
        } // we in global
        else{
            localScope = scopeStackDouble.peek();
        }

        while(condition==101.101){
            if(breakBool){
                breakBool=false;
                break;
            }
            else if(continueBool){
                continueBool=false;
                this.visit(ctx.compoundStatement());
                condition = this.visit(ctx.getChild(1));
                continue;
            }
            this.visit(ctx.compoundStatement());
            condition = this.visit(ctx.getChild(1));
        }
        return 1.1;
    }


    @Override
    public Double visitForStateBlock(Proj2Parser.ForStateBlockContext ctx) {

        HashMap<String, Double> localScope;
        if(scopeStackDouble.isEmpty()){
            localScope = globalScopeDouble;
        } // we in global
        else{
            localScope = scopeStackDouble.peek();
        }

        Double starValue = this.visit(ctx.varDef());
        Double finalValue = Double.parseDouble(ctx.INT().toString());
        for(double i=starValue;i<finalValue;i++){
            if(breakBool){
                breakBool=false;
                break;
            }

            this.visit(ctx.compoundStatement());
        }
        return 1.1;
    }
    /*
     *
     *
     * BREAK AND CONTINUE
     *
     *
     * */

    @Override
    public Double visitBreakStatementVisit(Proj2Parser.BreakStatementVisitContext ctx) {
        breakBool = true;
        return 1.1;
    }

    @Override
    public Double visitContinueStatementVisit(Proj2Parser.ContinueStatementVisitContext ctx) {
        continueBool = true;
        return 1.3;
    }



    /*
     *
     *
     * IF ELSE BLOCK
     *
     *
     * */

    @Override
    public Double visitIfElseBlock(Proj2Parser.IfElseBlockContext ctx) {
        Double a = this.visit(ctx.logicExpr());

        if(a==101.101){
            this.visit(ctx.getChild(3));
        }
        else {
            this.visit(ctx.getChild(6));
        }

        return 1.1;
    }

    /*
     *
     *
     * var Def
     *
     *
     * */


    @Override
    public Double visitVarDefVisit(Proj2Parser.VarDefVisitContext ctx) {
        String ID = ctx.getChild(0).getChild(0).getText();
        String ID2 = ctx.getChild(2).getText();

        if(!functions.containsKey(ID)) {

            Double val = this.visit(ctx.expr());
            HashMap<String, Double> localScope;
            if (val == null) {
                 //System.out.println("test");
            }
            if (scopeStackDouble.isEmpty()) {
                localScope = globalScopeDouble;
            } // we in global
            else {
                localScope = scopeStackDouble.peek();
            }// we in function
            localScope.put(ID, localScope.getOrDefault(ID, 0.0));
            //here we are checking if it is in our scope, if it is we don't put anything is otherwise add to scope.
            localScope.put(ID, val);
            //from here we should be able to store both id and value into the map
        }

        else{
            HashMap<String, Double> localScope;
            Double val = this.visit(ctx.expr());
            if (scopeStackDouble.isEmpty()) {
                localScope = globalScopeDouble;
            } // we in global
            else {
                localScope = scopeStackDouble.peek();
            }// we in function
            localScope.put(ID, localScope.getOrDefault(ID, 0.0));
            //here we are checking if it is in our scope, if it is we don't put anything is otherwise add to scope.
            //localScope.put(ID, val);

            globalScopeDouble.put(ID,val);
            return val;
        }

        return super.visitVarDefVisit(ctx);
    }

    @Override
    public Double visitVarSpecial(Proj2Parser.VarSpecialContext ctx) {
        String ID = ctx.getChild(0).getChild(0).getText();
        Double val = this.visit(ctx.specialExpr());
        HashMap<String, Double> localScope;
        if (val == null) {
            //System.out.println("test");
        }
        if (scopeStackDouble.isEmpty()) {
            localScope = globalScopeDouble;
        } // we in global
        else {
            localScope = scopeStackDouble.peek();
        }// we in function
        localScope.put(ID, localScope.getOrDefault(ID, 0.0));
        //here we are checking if it is in our scope, if it is we don't put anything is otherwise add to scope.
        localScope.put(ID, val);

        return super.visitVarSpecial(ctx);
    }

    @Override
    public Double visitVarTrueVisit(Proj2Parser.VarTrueVisitContext ctx) {
        String ID = ctx.getChild(0).getChild(0).getText();

        Boolean val = true;
        HashMap<String,Boolean> localScope;
        if(scopeStackBool.isEmpty()){
            localScope = globalScopeBool;
        } // we in global
        else{
            localScope = scopeStackBool.peek();
        }
        localScope.put(ID,localScope.getOrDefault(ID,false));
        localScope.put(ID,val);
        return 0.0;
    }

    @Override
    public Double visitVarFalseVisit(Proj2Parser.VarFalseVisitContext ctx) {
        String ID = ctx.getChild(0).getChild(0).getText();

        Boolean val = false;
        HashMap<String,Boolean> localScope;
        if(scopeStackBool.isEmpty()){
            localScope = globalScopeBool;
        } // we in global
        else{
            localScope = scopeStackBool.peek();
        }
        localScope.put(ID,localScope.getOrDefault(ID,true));
        localScope.put(ID,val);
        return 1.0;
    }






    /*
     *
     *
     * COMPARISONS
     *
     *
     * */



    @Override
    public Double visitLogicEqualExprVisit(Proj2Parser.LogicEqualExprVisitContext ctx) {
        //child 1 and 3
        Double left = this.visit(ctx.expr(0));
        Double right = this.visit(ctx.expr(1));
        if(left !=null || right !=null) {
            if (left.equals(right)) {
                return 101.101;
            } else {
                return -101.101;
            }
        }
        else{
            left = Double.parseDouble(ctx.expr(0).getText());
            right = Double.parseDouble(ctx.expr(1).getText());
            if(left.equals(right)){
                return 101.101;
            }
            else{
                return -101.101;
            }

        }

    }

    @Override
    public Double visitLogicNotEqualExprVisit(Proj2Parser.LogicNotEqualExprVisitContext ctx) {
        Double left = this.visit(ctx.expr(0));
        Double right = this.visit(ctx.expr(1));
        if(left !=null || right !=null) {
            if (!left.equals( right)) {
                return 101.101;
            } else {
                return -101.101;
            }
        }
        else{
            left = Double.parseDouble(ctx.expr(0).getText());
            right = Double.parseDouble(ctx.expr(1).getText());
            if(!left.equals(right)){
                return 101.101;
            }
            else{
                return -101.101;
            }

        }
    }

    @Override
    public Double visitLogicLTExprVisit(Proj2Parser.LogicLTExprVisitContext ctx) {
        Double left = this.visit(ctx.expr(0));
        Double right = this.visit(ctx.expr(1));
        if(left !=null || right !=null) {
            if (left < right) {
                return 101.101;
            } else {
                return -101.101;
            }
        }
        else{
            left = Double.parseDouble(ctx.expr(0).getText());
            right = Double.parseDouble(ctx.expr(1).getText());
            if(left<right){
                return 101.101;
            }
            else{
                return -101.101;
            }

        }
    }

    @Override
    public Double visitLogicLEExprVisit(Proj2Parser.LogicLEExprVisitContext ctx) {
        Double left = this.visit(ctx.expr(0));
        Double right = this.visit(ctx.expr(1));
        if(left !=null || right !=null) {
            if (left <= right) {
                return 101.101;
            } else {
                return -101.101;
            }
        }
        else{
            left = Double.parseDouble(ctx.expr(0).getText());
            right = Double.parseDouble(ctx.expr(1).getText());
            if(left<=right){
                return 101.101;
            }
            else{
                return -101.101;
            }

        }
    }

    @Override
    public Double visitLogicGTExprVisit(Proj2Parser.LogicGTExprVisitContext ctx) {
        Double left = this.visit(ctx.expr(0));
        Double right = this.visit(ctx.expr(1));
        if(left !=null || right !=null) {
            if (left > right) {
                return 101.101;
            } else {
                return -101.101;
            }
        }
        else{
            HashMap<String,Double> localScope;
            if(scopeStackDouble.isEmpty()){
                localScope = globalScopeDouble;
            } // we in global
            else{
                localScope = scopeStackDouble.peek();
            }
            if(!localScope.containsKey(ctx.getChild(1).getText())) {
                left = Double.parseDouble(ctx.expr(0).getText());
                right = Double.parseDouble(ctx.expr(1).getText());
                if (left > right) {
                    return 101.101;
                } else {
                    return -101.101;
                }
            }
            else{
                left = localScope.get(ctx.getChild(1).getText());
                return 0.0;

            }

        }
    }

    @Override
    public Double visitLogicGEExprVisit(Proj2Parser.LogicGEExprVisitContext ctx) {
        Double left = this.visit(ctx.expr(0));
        Double right = this.visit(ctx.expr(1));
        if(left !=null || right !=null) {
            if (left >= right) {
                return 101.101;
            } else {
                return -101.101;
            }
        }
        else{
            left = Double.parseDouble(ctx.expr(0).getText());
            right = Double.parseDouble(ctx.expr(1).getText());
            if(left>=right){
                return 101.101;
            }
            else{
                return -101.101;
            }

        }
    }



    /*
     *
     *
     * MATH EXPRESSIONS
     *
     *
     * */




    @Override
    public Double visitNothig(Proj2Parser.NothigContext ctx) {
        HashMap<String,Double> localScope;
        if(scopeStackDouble.isEmpty()){
            localScope = globalScopeDouble;
        } // we in global
        else{
            localScope = scopeStackDouble.peek();
        }
        Double returnVal = localScope.get(ctx.getText());
        return returnVal;
    }

    @Override
    public Double visitExprParenthesis(Proj2Parser.ExprParenthesisContext ctx) {
        return super.visitExprParenthesis(ctx);
    }

    @Override
    public Double visitExprDivision(Proj2Parser.ExprDivisionContext ctx) {
        HashMap<String,Double> localScope;
        if(scopeStackDouble.isEmpty()){
            localScope = globalScopeDouble;
        } // we in global
        else{
            localScope = scopeStackDouble.peek();
        }

        Double lefterm = this.visit(ctx.expr(0));
        if(lefterm==null){
            lefterm = localScope.get(ctx.expr(0).getText());
        }
        else{}
        Double rightTerm = this.visit(ctx.expr(1));
        if(rightTerm==null){
            rightTerm = localScope.get(ctx.expr(1).getText());
        }
        else{}

        return lefterm/rightTerm;
    }

    @Override
    public Double visitExprMultiplication(Proj2Parser.ExprMultiplicationContext ctx) {
        HashMap<String,Double> localScope;
        if(scopeStackDouble.isEmpty()){
            localScope = globalScopeDouble;
        } // we in global
        else{
            localScope = scopeStackDouble.peek();
        }

        Double lefterm = this.visit(ctx.expr(0));
        if(lefterm==null){
            lefterm = localScope.get(ctx.expr(0).getText());
        }
        else{}
        Double rightTerm = this.visit(ctx.expr(1));
        if(rightTerm==null){
            rightTerm = localScope.get(ctx.expr(1).getText());
        }
        else{}

        return lefterm*rightTerm;
    }

    @Override
    public Double visitExprAddition(Proj2Parser.ExprAdditionContext ctx) {
        HashMap<String,Double> localScope;
        if(scopeStackDouble.isEmpty()){
            localScope = globalScopeDouble;
        } // we in global
        else{
            localScope = scopeStackDouble.peek();
        }

        Double lefterm = this.visit(ctx.expr(0));
        if(lefterm==null){
            lefterm = localScope.get(ctx.expr(0).getText());
        }
        else{}
        Double rightTerm = this.visit(ctx.expr(1));
        if(rightTerm==null){
            rightTerm = localScope.get(ctx.expr(1).getText());
        }
        else{}

        return lefterm+rightTerm;
    }

    /*
     *
     *
     * SPECIAL FUNCTIONS
     *
     *
     * */

    @Override
    public Double visitSpecialExprWriteln(Proj2Parser.SpecialExprWritelnContext ctx) {

        HashMap<String,Double> localScope;
        if(scopeStackDouble.isEmpty()){
            localScope = globalScopeDouble;
        } // we in global
        else{
            localScope = scopeStackDouble.peek();
        }
        if(ctx.identifier().size()==0){
            int strings = ctx.children.size() - 3;
            String finalStrings[] = new String[strings];


            for (int i = 0; i < finalStrings.length; i++) {
                finalStrings[i] = ctx.getChild(i + 2).getText();
                System.out.println(finalStrings[i] + " ");
            }
            return super.visitSpecialExprWriteln(ctx);
        }

        if(localScope.containsKey(ctx.identifier(0).getText())){
            System.out.println(localScope.get(ctx.identifier(0).getText()));
        }
        else {
            System.out.print(ctx.identifier(0).getText());
        }

        return super.visitSpecialExprWriteln(ctx);

    }

    @Override
    public Double visitSpecialExprSqrt(Proj2Parser.SpecialExprSqrtContext ctx){
        double solution = 0;
        solution = Math.sqrt(this.visit(ctx.expr()));
        return solution;
    }

    @Override
    public Double visitSpecialExprSin(Proj2Parser.SpecialExprSinContext ctx){
        double solution = 0;
        solution = Math.sin(this.visit(ctx.expr()));
        return solution;
    }

    @Override
    public Double visitSpecialExprCos(Proj2Parser.SpecialExprCosContext ctx){
        double solution = 0;
        solution = Math.cos(this.visit(ctx.expr()));

        return solution;
    }

    @Override
    public Double visitSpecialExprLn(Proj2Parser.SpecialExprLnContext ctx){
        double solution = 0;
        solution = Math.log(this.visit(ctx.expr()));
        return solution;
    }

    @Override
    public Double visitSpecialExprExp(Proj2Parser.SpecialExprExpContext ctx){
        double solution = 0;
        solution = Math.exp(this.visit(ctx.expr()));
        return solution;
    }

    @Override
    public Double visitReadDouble(Proj2Parser.ReadDoubleContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    @Override
    public Double visitSpecialExprReadln(Proj2Parser.SpecialExprReadlnContext ctx) {
        HashMap<String,Double> localScope;
        if(scopeStackDouble.isEmpty()){
            localScope = globalScopeDouble;
        } // we in global
        else{
            localScope = scopeStackDouble.peek();
        }
        String ID = ctx.identifier().getText();
        Double val = scnr.nextDouble();
        localScope.put(ID,val);

        return super.visitSpecialExprReadln(ctx);
    }
}
