import java.util.HashMap;

public class Variable implements Expression {
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	public int interpret(HashMap<String, Expression> context) {
		if (null == context.get(name))
			return 0; // Either return new Number(0).
		return context.get(name).interpret(context);
	}
}