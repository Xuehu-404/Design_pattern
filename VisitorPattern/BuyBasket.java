package 访问者模式;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
    private ArrayList list = new ArrayList();
    public void accept(AVisitor visitor)
    {
        Iterator i = list.iterator();

        while(i.hasNext())
        {
            ((IProduct)i.next()).accept(visitor);
        }
    }

    public void addProduct(IProduct ...x)
    {
        for(IProduct product:x)
            list.add(product);
    }

    public void removeProduct(IProduct product)
    {
        list.remove(product);
    }
}
