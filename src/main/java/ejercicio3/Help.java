package ejercicio3;

import java.util.Stack;

public class Help {

    private Stack<String> imprimir = new Stack<>();

    private static Help instance;

    private Help() {}

    public static Help getInstance() {
        if(instance == null) {
            instance = new Help();
        }
        return instance;
    }

    public void add(String info) {
        imprimir.push(info);
    }

    public int getStackSize() {
        return imprimir.size();
    }

    public void showInfo() {
        while(!imprimir.isEmpty()) {
            System.out.print(imprimir.pop());
        }
    }

}
