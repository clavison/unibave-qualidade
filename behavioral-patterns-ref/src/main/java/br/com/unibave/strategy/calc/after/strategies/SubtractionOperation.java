package br.com.unibave.strategy.calc.after.strategies;

public class SubtractionOperation implements OperationStrategy {

	@Override
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}

}
