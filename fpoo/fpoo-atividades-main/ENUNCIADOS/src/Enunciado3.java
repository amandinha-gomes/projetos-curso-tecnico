
public class Enunciado3 {
	
	float n1, n2, n3, n4, n5, media;
	
	public void calcularMedia() {
		
		float media;
		media = (getN1() + getN2() + getN3() + getN4()) / 4;
		setMedia(media);
		
	}
	
	public void calcularMedia2() {
		
		float media;
		media = (getN1() + getN2() + getN3() + getN4() + getN5()) / 5;
		setMedia(media);
		
	}
	
	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getN3() {
		return n3;
	}

	public void setN3(float n3) {
		this.n3 = n3;
	}

	public float getN4() {
		return n4;
	}

	public void setN4(float n4) {
		this.n4 = n4;
	}

	public float getN5() {
		return n5;
	}

	public void setN5(float n5) {
		this.n5 = n5;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}


}
