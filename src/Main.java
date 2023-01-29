public class Main {
    public static void main(String[] args) {
        int opereitionindex = 0;
        do {
            System.out.println("----"+ args[opereitionindex]+"----");
            String operation = args[opereitionindex];
            int dato1 = Integer.parseInt(args[opereitionindex + 1]);
            int dato2 = Integer.parseInt(args[opereitionindex + 2]);
            switch (operation) {
                case "suma":
                    System.out.println(dato1 + "+" + dato2 + "= " + (dato2 + dato1));
                    break;
                case "multiplicacion":
                    System.out.println(dato1 + "*" + dato2 + "= " + (dato1 * dato2));
                    break;
                case "divicion":
                    System.out.println(dato1 + "/" + dato2 + "= " + (dato1 / dato2));
                    break;
                case "resta":
                    System.out.println(dato1 + "-" + dato2 + "= " + (dato1 - dato2));
                    break;
            }
            opereitionindex +=3;
        }while(opereitionindex < args.length);
    }
}