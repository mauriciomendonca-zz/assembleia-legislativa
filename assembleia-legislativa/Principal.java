import models.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        Estadual dep1 = new Estadual("Dep1", "PPT", 20.3, 20.3, 12, "RS");
        Federal dep2 = new Federal("Dep2", "PPS", 25.000, 32.000, 34, 123);
        Federal dep3 = new Federal("Dep3", "PLN", 10.000, 8.000, 3, 456);
        Federal dep4 = new Federal("Dep4", "JNF", 13.000, 13.000, 34, 789);
        Estadual dep5 = new Estadual("Dep5", "PPL", 9.000, 7.200, 21, "RS");
        Estadual dep6 = new Estadual("Dep6", "PIL", 22.000, 17.600, 10, "SP");
        Federal dep7 = new Federal("Dep7", "KML", 32.000, 30.000, 10, 321);
        Federal dep8 = new Federal("Dep8", "WHM", 25.000, 29.000, 4, 654);
        Estadual dep9 = new Estadual("Dep9", "GRE", 10.000, 18.000, 9, "SC");
        Estadual dep10 = new Estadual("Dep10", "MIO", 21.000, 16.800, 32, "RJ");

        Deputado[] deputados = {dep1, dep2, dep3, dep4, dep5, dep6, dep7, dep8, dep9, dep10};

        ProcuraCorruptos procuraCorruptos = new ProcuraCorruptos(deputados);
        Deputado[] deputadosComMaisFuncionarios = procuraCorruptos.deputadosComMaisFuncionarios();
        Deputado[] deputadosQueRecebemValores = procuraCorruptos.deputadosQueRecebemValores();
        Deputado[] deputadosDesviamVerbas = procuraCorruptos.deputadosQueDesviamVerbas();

        System.out.println("Deputados com mais funcionários:");
        for (Deputado deputado : deputadosComMaisFuncionarios) {
            if (deputado instanceof Estadual) {
                System.out.println(((Estadual) deputado).getUf());
            } else if (deputado instanceof Federal) {
                System.out.println(((Federal) deputado).getNumeroCadastro());
            }
        }

        System.out.println("Deputados que recebem valores:");
        for (Deputado deputado : deputadosQueRecebemValores) {
            if (deputado instanceof Estadual) {
                System.out.println(((Estadual) deputado).getUf());
            } else if (deputado instanceof Federal) {
                System.out.println(((Federal) deputado).getNumeroCadastro());
            }
        }

        System.out.println("Deputados que desviam verbas:");
        for (Deputado deputado : deputadosDesviamVerbas) {
            if (deputado instanceof Estadual) {
                System.out.println(((Estadual) deputado).getUf());
            } else if (deputado instanceof Federal) {
                System.out.println(((Federal) deputado).getNumeroCadastro());
            }
        }

    }
}