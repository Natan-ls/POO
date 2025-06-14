public class Zoo {
	private Animal []animais = new Animal[100];
	
	public void setAnimal(Animal []animais){
		this.animais = animais;
	}
	
	public Animal[] getAnimais(){
		return animais;
	}
	
	public boolean adicionarAnimal(Passaro passaro){
		for(int x = 0; x < animais.length; x++){
			if(animais[x] == null){
				animais[x] = passaro;
				return true;
			}
		}
		return false;
	}

	public boolean adicionarAnimal(Cachorro cachorro){
		for(int x = 0; x < animais.length; x++){
			if(animais[x] == null){
				animais[x] = cachorro;
				return true;
			}
		}
		return false;
	}
	
	public boolean adicionarAnimal(Cavalo cavalo){
		for(int x = 0; x < animais.length; x++){
			if(animais[x] == null){
				animais[x] = cavalo;
				return true;
			}
		}
		return false;
	}
	
	public boolean excluirAnimal(Animal animal){
		for(int x = 0; x < animais.length; x++){
			if(animais[x] == animal){
				animais[x] = null;
				return true;
			}
		}
		return false;
	}
	
	public Double calcula(Animal animal){
		if(animal.tipo == 1){
			Passaro passaro = (Passaro) animal;
			passaro.alturaDoVoo();
		}
		else if(animal.tipo == 2){
			Cachorro cachorro = (Cachorro)animal;
			return cachorro.correr();
		}	
		Cavalo cavalo = (Cavalo) animal;
		return cavalo.correr();
	}
	
	public Animal buscaAnimal(String nome){
		for(int x = 0; x < animais.length; x++){
			if(animais[x] == null){
				if(animais[x].nome.equals(nome))
					return animais[x];
			}
		}
		return null;
	}
}
