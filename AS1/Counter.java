
class Counter 
{ 
    private int count;

    public Counter(int initialCount) 
    {
       this.count = initialCount; 
    }
    public Counter() 
    {
       this.count = 0; 
    }
    public void increment() 
    {
        this.count += 1; 
    }
    public void reset() 
    {
        this.count = 0;
    }
    public int getValue()
    {
        return this.count; }
}