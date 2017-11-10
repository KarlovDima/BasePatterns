package behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = isJavaExpression();
        Expression isJavaEEExprssion = isJavaEEExpression();

        System.out.println("Does developer know Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer know Spring: " + isJavaEEExprssion.interpret("Java Spring"));
    }

    private static Expression isJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");
        return new OrExpression(java, javaCore);
    }

    private static Expression isJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);
    }
}
