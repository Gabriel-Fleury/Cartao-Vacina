import java.time.LocalDate;

//representa uma dose de vacina.
public class Dose {
  // a data em que a dose foi administrada.
  private LocalDate data;
  // o local em que a dose foi adiministrada.
  private String local;

  // cria uma nova instancia de dose com a data e local especificados.
  public Dose(LocalDate data, String local) {
    this.data = data;
    this.local = local;
  }
  // obtem a data em que a dose foi administrada.

  public LocalDate getData() {
    return data;
  }

  // obtem o local em que a dose foi administrada.
  public String getLocal() {
    return local;
  }
}// nesse codigo a clase "Dose" representa uma dose de vacina com uma data e
 // local especificados . a classe possui dois campos privates 'data' e 'local'
 // que sao obtidos usando 'getLocal' e 'getData'.