public final class Layer extends Box {
    private int total;

    public Layer(String nama, String ukuran, int jumlah, int total){
        super(nama, ukuran, jumlah);
        this.total = total;

    }

    public final void setTotal(int total){
        this.total = total;
    }

    public int getTotal(){
        return total;
    }

    @Override
    public void isDisplay(){
        System.out.println("==========================================================");
        super.isDisplay();
        System.out.println("Total Layer : " + this.total);
        System.out.println("==========================================================");
    }
    //Overloading
    public void isDisplay(boolean p){
        if(p) isDisplay();
        else super.isDisplay();
    }

}
