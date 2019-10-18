package domain;

public class Teste {
	public static void main(String[] args) {
		//atribuindo o singleton hostel a uma variavel
		Hostel hostel = Hostel.getHostel();
		
		//criando clientes
		hostel.createCustomer("11111111111", "Maria Luiza","Fernandes", "19/04/2000", "Av. Getúlio Vargas", "37165000", "Alfenas", "MG", "Brasil", "mrluiza.fernandes@gmail.com");
		hostel.createCustomer("22222222222", "Otávio Augusto","Faria", "11/11/1999", "Av. Afonso Pena", "39165010", "São Paulo", "SP", "Brasil", "tavimDestruidorDoCS@gmail.com");
		hostel.createCustomer("33333333333", "Luana de Jesus","Carvalho", "11/12/2000", "Mariana Ambrosina dos Reis", "40168020", "Rio de Janeiro", "RJ", "Brasil", "luana@gmail.com");
		
		//fazendo reservas
		hostel.makeReservation(hostel.getCustomers().get(0), "18/10/2019", "01/11/2019", "07/08/2019");
		hostel.makeReservation(hostel.getCustomers().get(1), "20/11/2019", "11/12/2019", "15/12/2019");
		hostel.makeReservation(hostel.getCustomers().get(2), "27/10/2019", "28/10/2019", "29/08/2019");
	}
}
