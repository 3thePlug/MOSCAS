public class Tablero {
    int tam = 4;
    int numMoscas;
    int numMoscasVivas;
    Mosca[][] tab = new Mosca[tam][tam];

    public Tablero(int numMoscas) {
        this.numMoscas = numMoscas;
        numMoscasVivas = numMoscas;
        for (int i = 0; i < numMoscas; i++) {
            colocarMosca();
        }
    }
    private void colocarMosca() {
        int x, y;
        do {
            x = (int) (Math.random() * (tab.length));
            y = (int) (Math.random() * (tab.length));
        } while (this.tab[x][y]!=null);
        this.tab[x][y] = new Mosca(tipoMosca.Corriente);
    }
    @Override
    public String toString() {
        String salida = new String();
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[1].length; j++) {
                if (this.tab[i][j]!=null) {
                    salida += this.tab[i][j] + " ";
                } else {
                    salida += "[]";
                }
            }
            salida+="\n";
        }
        return salida;
    }
    public void golpear(int posX, int posY) {
        if (this.tab[posX][posY]!=null) {
            if (this.tab[posX][posY].perderVida()) {
                if (numMoscasVivas>0) {
                    numMoscasVivas--;
                }
            }
        } else {
            comprobarAlrededores(posX, posY);
        }
    }
    private void comprobarAlrededores(int posX, int posY) {
        if (posX>0) {
            if (posY>0) {
                if (tab[posX-1][posY-1]!=null) {
                    volarMosca(posX-1, posY-1);
                }
            }
            if (tab[posX-1][posY]!=null) {
                volarMosca(posX-1, posY);
            }
            if (tab[posX-1][posY+1]!=null) {
                volarMosca(posX - 1, posY + 1);
            }
        }
        if (posY>0 && tab[posX][posY - 1]!=null) {
            volarMosca(posX, posY - 1);
        }
        if (posY<tab.length && tab[posX][posY + 1] != null) {
            volarMosca(posX, posY + 1);
        }
        if (posX < tab.length-1) {
            if (posY > 0) {
                if (tab[posX + 1][posY - 1] != null) {
                    volarMosca(posX + 1, posY - 1);
                }
            }
            if (tab[posX + 1][posY] != null) {
                volarMosca(posX + 1, posY);
            }
            if (tab[posX + 1][posY + 1] != null) {
                volarMosca(posX + 1, posY + 1);
            }
        }
        if (posY > 0 && tab[posX][posY - 1] != null) {
            volarMosca(posX, posY - 1);
        }
        if (posY < tab.length && tab[posX][posY + 1] != null) {
            volarMosca(posX, posY + 1);
        }
    }
    public int getTam() {
        return tam;
    }
    public void setTam(int tam) {
        this.tam = tam;
    }
    public int getNumMoscas() {
        return numMoscas;
    }
    public void setNumMoscas(int numMoscas) {
        this.numMoscas = numMoscas;
    }
    public int getNumMoscasVivas() {
        return numMoscasVivas;
    }
    public void setNumMoscasVivas(int numMoscasVivas) {
        this.numMoscasVivas = numMoscasVivas;
    }
    public Mosca[][] getTab() {
        return tab;
    }
    public void setTab(Mosca[][] tab) {
        this.tab = tab;
    }
    private void volarMosca(int posX, int posY) {

        tab[posX][posY]=null;
        int x, y;
        do {
            x = (int) (Math.random() * (tab.length));
            y = (int) (Math.random() * (tab.length));
        } while (this.tab[x][y]!=null);
       
    }
}
