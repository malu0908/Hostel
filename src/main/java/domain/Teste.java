package domain;

import java.util.Iterator;

public class Teste {
	public static void main(String[] args) {
		// atribuindo o singleton hostel a uma variavel
		Hostel hostel = Hostel.getHostel();

		// criando clientes
		try {
			hostel.createCustomer("Miss.", "Maria Luiza", "Fernandes", "19/04/2000", "Av. Getúlio Vargas", "37165000",
					"Alfenas", "MG", "Brasil", "mrluiza.fernandes@gmail.com");
			hostel.createCustomer("Mr.", "Otávio Augusto", "Faria", "11/11/1999", "Av. Afonso Pena", "39165010",
					"São Paulo", "SP", "Brasil", "tavimDestruidorDoCS@gmail.com");
			hostel.createCustomer("Miss.", "Luana de Jesus", "Carvalho", "11/12/2000", "Mariana Ambrosina dos Reis",
					"40168020", "Rio de Janeiro", "RJ", "Brasil", "luana@gmail.com");
			hostel.createCustomer("aa", null, null, null, null, null, null, null, null, null);
		} catch (RuleViolatedException ex) {
			System.out.println(ex.getMessage());
		}

		// criando quartos
		hostel.createRoom(1, 1000);
		hostel.createRoom(2, 2000);
		hostel.createRoom(3, 3000);
		hostel.createRoom(4, 500);

		// adicionando quartos
		Room r = new Room(5, 1500);
		hostel.addRoom(r);

		Room s = new Room(6, 1700);
		hostel.addRoom(s);

		// fazendo reservas
		hostel.makeReservation(hostel.getCustomers().get(0), "18/10/2019", "01/11/2019", "07/08/2019");
		hostel.makeReservation(hostel.getCustomers().get(1), "20/11/2019", "11/12/2019", "15/12/2019");
		hostel.makeReservation(hostel.getCustomers().get(2), "27/10/2019", "28/10/2019", "29/08/2019");

		int i = 0;
		int indice = 0;
		Iterator<Reservation> res = hostel.getCustomers().get(i).getReservations().iterator();
		while (res.hasNext()) {
			Reservation reservaAtual = res.next();
			reservaAtual.addRooms(hostel.getRooms().get(indice));
			reservaAtual.addRooms(hostel.getRooms().get(indice + 1));

			i++;
			indice += 2;
			if (i < hostel.getCustomers().size())
				res = hostel.getCustomers().get(i).getReservations().iterator();
		}

		// procurando room pelo numero
		try {
			hostel.searchRoomByNumber(1);
			System.out.println("Quarto de número 1 encontrado");
		} catch (RoomNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			hostel.searchRoomByNumber(7);
			System.out.println("Quarto de número 7 encontrado!");
		} catch (RoomNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		// procurando customer pelo nome
		try {
			hostel.searchCustomerByName("Maria Luiza", "Fernandes");
			System.out.println("A cliente Maria Luiza Fernandes foi encontrada!");
		} catch (CustomerNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			hostel.searchCustomerByName("Paulo Henrique", "de Oliveira");
			System.out.println("O cliente Paulo Henrique de Oliveira foi encontrado!");
		} catch (CustomerNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		// procurando reserva
		try {
			hostel.searchReservationByCustomerName("Maria Luiza", "Fernandes");
			System.out.println("Foi encontrado reserva no nome de Maria Luiza Fernandes!");
		} catch (ReservationNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			hostel.searchReservationByCustomerName("Julia", "Cabral");
			System.out.println("Foi encontrado reserva no nome de Julia Cabral!");
		} catch (ReservationNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println();

		// printando os clientes
		i = 0;
		while (i < hostel.getCustomers().size()) {
			System.out.println(hostel.getCustomers().get(i));
			i++;
		}

		// Fazendo o pagamento das reservas
		try {
			hostel.makePayment(10000, "CashPayment", hostel.getCustomers().get(0).getReservations().iterator().next());
			System.out.println("Pagamento efetuado com sucesso!");
		} catch (PaymentInsufficientException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			hostel.makePayment(100.50, "CheckPayment", hostel.getCustomers().get(1).getReservations().iterator().next());
			System.out.println("Pagamento efetuado com sucesso!");
		} catch (PaymentInsufficientException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			hostel.makePayment(135000, "CreditCardPayment", hostel.getCustomers().get(2).getReservations().iterator().next());
			System.out.println("Pagamento efetuado com sucesso!");
		} catch (PaymentInsufficientException ex) {
			System.out.println(ex.getMessage());
		}
	}
}