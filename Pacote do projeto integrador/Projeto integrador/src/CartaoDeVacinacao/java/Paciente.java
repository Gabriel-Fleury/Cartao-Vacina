import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//representa um paciente com as informações de nome , CPF , data de nascimento e as vacinas que ele recebeu.

public class Paciente {
  // nome paciente.

  private String nome;
  // cpf paciente.
  private String cpf;
  // data de nascimento paciente.
  private LocalDate dataDeNascimento;
  // as vacinas que o paciente recebeu.
  private List<Vacina> vacinas;

  // cria um novo paciente com nome , CPF, data de nascimento especificados.
  public Paciente(String nome, String cpf, LocalDate dataDeNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
    this.vacinas = new ArrayList<Vacina>();

  }

  // adiciona uma nova vacina ao paciente.
  public void addVacina(Vacina vacina) {
    this.vacinas.add(vacina);

  }

  // anotação que indica que este método está sobrescrevendo um método herdado da
  // classe Object
  @Override

  public String toString() {
    StringBuilder sb = new StringBuilder();
    // abaixo adicionam as informaçoes do paciente a String.
    sb.append("Nome: ").append(nome).append(System.lineSeparator());
    sb.append("CPF: ").append(cpf).append(System.lineSeparator());
    sb.append("Data de Nascimento: ").append(dataDeNascimento).append(System.lineSeparator());
    sb.append("Vacinas:").append(System.lineSeparator());

    int count = 1;// inicializa o contador de vacinas em 1
    for (Vacina vacina : vacinas) {// itera sobre as vacinas do paciente
      int doseCount = 1; // inicializa o contador de doses em 1
      // abaixo informaçoes sobre a vacina á string.
      sb.append("  ").append(count).append(". ").append(vacina.getNome()).append(System.lineSeparator());
      sb.append("    Fabricante: ").append(vacina.getFabricante()).append(System.lineSeparator());
      sb.append("    Doses:").append(System.lineSeparator());
      for (Dose dose : vacina.getDoses()) { // itera sobre as doses da vacina .
        sb.append("      Dose ").append(doseCount).append(". ").append(dose.getData()).append(" - ")
            .append(dose.getLocal()).append(System.lineSeparator());
        doseCount++;// incrementa o contador de doses.
      }

      count++;// incrementa o contador de vacinas .

    }

    return sb.toString();// retorna toda string de forma formatada .

  }

}