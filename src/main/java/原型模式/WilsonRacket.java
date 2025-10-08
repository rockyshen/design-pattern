package 原型模式;

/**
 * @author rockyshen
 * @date 2025/10/8 15:20
 */
public class WilsonRacket extends RacketPrototype{

    public WilsonRacket(String brand, String model, double weight, double balancePoint){
        super(brand,model,weight,balancePoint);

    }

    @Override
    public RacketPrototype clonePrototype() {
        return new WilsonRacket(this.brand,this.model,this.weight,this.balancePoint);
    }
}
