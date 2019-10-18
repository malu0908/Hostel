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
	
		//fazendo pagamentos
		hostel.makePayment(700.0, "CashPayment");
		hostel.makePayment(500.0, "CheckPayment");
		hostel.makePayment(200.0, "CreditCardPayment");
		
		//criando quartos
		hostel.createRoom(1, 1000);
		hostel.createRoom(2, 2000);
		hostel.createRoom(3, 3000);
		
		//adicionando quartos
		Room r = new Room();
		r.setDimension(1500);
		r.setNumber(5);
		hostel.addRoom(r);
		
		Room s = new Room();
		s.setDimension(1700.30);
		s.setNumber(6);
		hostel.addRoom(s);
	}
}
