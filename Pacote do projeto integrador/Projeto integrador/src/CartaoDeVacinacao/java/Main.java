import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//classe principal do programa.
public class Main {
  // metodo principal do programa.
  public static void main(String[] args) {
    // formata a data de nascimento do paciente.
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dataNascimento = LocalDate.parse("1990-01-01", formatter);
    // cria uma nova instancia do paciente.
    Paciente paciente = new Paciente("João Silva", "12345678909", dataNascimento);
    // adiciona vacinas ao paciente.
    // Em seguida, cria duas instâncias de vacina e adiciona as doses a cada vacina
    // usando o método addDose. e adiciona as vacinas ao paciente usando o método
    // addVacina.
    Vacina vacinaCovid = new Vacina("Covid-19", "Pfizer");
    vacinaCovid.addDose(new Dose(LocalDate.parse("2021-05-01", formatter), "São Paulo"));
    vacinaCovid.addDose(new Dose(LocalDate.parse("2021-06-01", formatter), "São Paulo"));
    Vacina vacinaGripe = new Vacina("Gripe", "AstraZeneca");
    vacinaGripe.addDose(new Dose(LocalDate.parse("2021-11-01", formatter), "São Paulo"));
    Vacina vacinaRaiva = new Vacina("Raiva", "Merial");
    vacinaRaiva.addDose(new Dose(LocalDate.parse("2022-03-01", formatter), "Clínica do Dr. Silva"));
    vacinaRaiva.addDose(new Dose(LocalDate.parse("2022-04-01", formatter), "Clínica do Dr. Silva"));
    paciente.addVacina(vacinaCovid);
    paciente.addVacina(vacinaGripe);
    paciente.addVacina(vacinaRaiva);
    // Imprime as informaçoes do paciente
    // Por fim, imprime as informações do paciente usando o método toString(retornar
    // um objeto String ) O método toString busca na classe paciente.java para
    // imprimir as informações do paciente de forma legível.
    System.out.println(paciente);

  }

}
// Neste código, o método main é o ponto de entrada do programa. Ele inicializa
// uma instância do formato de data usando o formato dd/MM/yyyy (dd=dia , mm=
// mes e yyyy ano ) Em seguida, cria uma instância do paciente com o nome, CPF e
// data de nascimento especificados.