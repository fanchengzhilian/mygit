Class OperationAdd : Operation
{
    public override double GetResult()
    {
        double result = 0;
        result = NumberA + NumberB;
        return result;
    }
}

Class OperationSub : Operation
{
    public override double GetResult()
    {
        double reslut = 0;
        result = NumberA - NumberB;
        return result;
    }
}

Class OperationMul : Operation
{
    public override double GetResult()
    {
        double reslut = 0;
        result = NumberA * NumberB;
        return result;
    }
}

Class OperationDiv : Operation
{
    public override double GetResult()
    {
        double reslut = 0;
        result = NumberA / NumberB;
        return result;
    }
}


public class Operation
{
    private double _numberA = 0；
    private double _numberB = 0;
    
    public double NumberA
    {
        get{ return _numberA;}
        set{ _numberA = value;}   
    }
    
    public double NumberB
    {
        get{ return _numberB;}
        set{ _numberB = value;}   
    }
    
    public virtual double GetResult()
    {
        double result = 0;
        return result;
    }
}
