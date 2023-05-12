package Classes;

public class ActionClient extends Actor{

    public String ActionName; // Название акции
    public static int ClientNumberInAction; // Номер клиента в акции

    public ActionClient(String name, String actionName, int idInAction) {
        super(name);
        this.ActionName=actionName;
        this.ClientNumberInAction=idInAction;
    }


    @Override
    public String getName() {
            return super.name;
    }
    @Override
    public Actor getActor() {
        return this;
    }
    @Override
    public boolean isMakeOrder() {
            return super.isMakeOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
        
    
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder=pickUpOrder;
    }
    
}
