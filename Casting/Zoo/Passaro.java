public class Passaro extends Animal {
	protected boolean voa;
	protected int envergadura;
	
	public Passaro(String nome, Double peso, boolean voa, int envergadura){
		super(nome, peso, 1);
		this.voa = voa;
		this.envergadura = envergadura;
	}
    
    public void setVoa(boolean voa){
		this.voa = voa;
	}
	
	public boolean getVoa(){
		return voa;
	}
        
    public void setEnvergadura(int envergadura){
		this.envergadura = envergadura;
	}
	
	public int getEnvergadura(){
		return envergadura;
	}
	
	public Double alturaDoVoo(){
		return voa == true ? envergadura*100/peso : 0.0;
	} 
}
