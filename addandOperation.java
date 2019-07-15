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
