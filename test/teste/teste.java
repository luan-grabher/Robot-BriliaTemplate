package teste;

import ContabilityTemplateImportation.Main;

public class teste {

    public static void main(String[] args) {
        StringBuilder parametros = new StringBuilder();
        
        parametros.append("[mes:3]");
        parametros.append("[ano:2021]");
        parametros.append("[ini:robot-protecaesCEFPag]");

        Main.testParameters = parametros.toString();
        args = new String[]{"test"};

        Main.main(args);
    }
}