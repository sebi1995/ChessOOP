package pl.sda.patterns.templatemethod.barista;

public class BeverageUsage {

	public static void main(String[] args) {
 
		Tea tea = new Tea();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();

		Coffee coffee = new Coffee();
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();

		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
