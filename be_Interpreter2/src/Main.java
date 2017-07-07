import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		String expression = "w x z - +";
		Evaluator sentence = new Evaluator(expression);
		HashMap<String, Expression> context = new HashMap<String, Expression>();
		context.put("w", new Number(5));
		context.put("x", new Number(10));
		context.put("z", new Number(42));
		int result = sentence.interpret(context);
		System.out.println(result);
	}
}
