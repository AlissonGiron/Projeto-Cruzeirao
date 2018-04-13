package cruzeirao.web;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean
@SessionScoped
public class ExampleComponentsMB {
	private Calendar date;
	private Calendar dateTime;
	
	private List<String> comboBoxItems;
	private String comboBoxSelectedItem;
	
	public ExampleComponentsMB() {
		date = Calendar.getInstance();
		dateTime = Calendar.getInstance();
		
		// 1 de FEVEREIRO (sim, o mês começa em 0 (SÓ O MÊS))
		date.set(2018, 01, 01);
		dateTime.set(2018, 01, 01, 14, 50, 06);
		
		comboBoxItems = new ArrayList<String>();
		comboBoxItems.add("Item 1");
		comboBoxItems.add("Item 2");
		comboBoxItems.add("Item 3");
		
		comboBoxSelectedItem = comboBoxItems.get(1);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cruzeirao");
		EntityManager em = factory.createEntityManager();
		em.createQuery("select J from Jogador J");
	}

	public List<String> getComboBoxItems() {
		return comboBoxItems;
	}

	public void setComboBoxItems(List<String> comboBoxItems) {
		this.comboBoxItems = comboBoxItems;
	}

	public String getComboBoxSelectedItem() {
		return comboBoxSelectedItem;
	}

	public void setComboBoxSelectedItem(String comboBoxSelectedItem) {
		this.comboBoxSelectedItem = comboBoxSelectedItem;
	}

	public Date getDateAsDate() {
		return date.getTime();
	}

	public Date getDateTimeAsDate() {
		return dateTime.getTime();
	}

}
