/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer01lista02;

/**
 *
 * @author GABRIEL
 */
public class Lista {
    private String list[] = new String[4];
    private int posicao = 0;

    public void insert(String value) {
        if (posicao > list.length / 2) {
            acresce();
        }

        list[posicao] = value;
        posicao++;
    }

    public int remove(int index) {
        if (list[index] == null) {
            return -1;
        }

        posicao--;

        if (posicao < list.length / 4) {
            if (posicao > 0) {
                decresce();
            }
        }

        String temp[] = list;
        int itemIndex = 0;

        temp[index] = null;

        list = new String[list.length];

        for (String item : temp) {
            if (item != null) {
                list[itemIndex] = item;
            }

            itemIndex++;
        }

        return index;
    }

    public void acresce() {
        String temp[] = list;
        int index = 0;

        list = new String[list.length * 2];

        for (String item : temp) {
            list[index] = item;
            index++;
        }
    }

    public void decresce() {
        String temp[] = list;
        int index = 0;

        list = new String[list.length / 2];

        for (String item : list) {
            list[index] = temp[index];
            index++;
        }
    }

    public String[] getLista() {
        return list;
    }

    public String getItem(int index) {
        return list[index];
    }

    public int getTamanho() {
        return list.length;
    }

    public int getPosicao() {
        return posicao;
    }
}
