package Controllers;

import Model.Item;
import View.GerenciarItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;


public class ControllerItem {
    
    private Item item = new Item();
    private GerenciarItem ger = new GerenciarItem();
    private List<Item> listItem = new ArrayList<Item>();
    
    
    
    public List<Item> getListItem(){
            return listItem;
        }
    
    public Item cadCliente(Item item) {

        if (consItem(item) == null) {
            listItem.add(item);
            return item;
        } else {
            return null;
        }

    }
    
    
    public Item consItem(Item item){
		for(int i = 0; i < listItem.size(); i++){
			if(Objects.equals(item.getId(), listItem.get(i).getId())){
				return listItem.get(i);
			}
		}
		return null;
	}
    
    
    
    
    
    
    
    
    
    
    
    
}
