import java.util.*;
//modifica branch evoluzione
public class Persona 
{

	//Attributi
	private String nome;
	private char sesso;
	private int eta;
	private String professione;
	
	//Costruttori
	public Persona(String nome, char sesso, int eta, String professione)
	{
		this.nome=nome;
		this.sesso=sesso;
		this.eta=eta;
		this.professione=professione;	
	}
	
	//metodi getter e setter
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setSesso(char sesso)
	{
		sesso=sesso;
	}
	
	public char getSesso()
	{
		return sesso;
	}
	
	public void setEta (int eta)
	{
		this.eta=eta;
	}
	
	public int getEta()
	{
		return eta;
	}
	
	public void setProfessione(String professione)
	{
		this.professione=professione;
	}
	
	public String getProfessione()
	{
		return professione;
	}
	
	public String chiSei()
	{
		String risposta;
		risposta="Sono un persona di nome "+nome+" sesso: "+sesso+ " età: "+eta+" professione: "+professione;
		return risposta;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner tastiera=new Scanner(System.in);
		 String nome;
		 String sessoStringa;
		 char sesso;
		 int eta;
		 String professione;
		 System.out.println("Inserisci il nome");
		 nome=tastiera.nextLine();
		 System.out.println("Inserisci il sesso (M o F)");
		 sessoStringa=tastiera.nextLine();
		 sesso=sessoStringa.charAt(0);
		 System.out.println("Inserisci l'età");
		 eta=tastiera.nextInt();
		 tastiera.nextLine(); //ripulisce buffer input
		 System.out.println("Inserisci la professione");
		 professione=tastiera.nextLine();
		 
		 Persona persona=new Persona(nome,sesso,eta,professione);
		 System.out.println(persona.chiSei());
				 
		 

	}
	
	

}
