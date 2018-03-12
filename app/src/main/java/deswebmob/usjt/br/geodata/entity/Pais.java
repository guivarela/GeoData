package deswebmob.usjt.br.geodata.entity;

import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;

/**
 * Created by Guilherme Varela, RA: 81613746.
 */

public class Pais implements Serializable, Comparable{
    private String nome, codigo, capital, regiao, subRegiao, demonimo, bandeira;
    private int populacao, area;
    private double gini, longitude, latitude;
    private ArrayList<String> idiomas, moedas, dominios, fusos, fronteiras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSubRegiao() {
        return subRegiao;
    }

    public void setSubRegiao(String subRegiao) {
        this.subRegiao = subRegiao;
    }

    public String getDemonimo() {
        return demonimo;
    }

    public void setDemonimo(String demonimo) {
        this.demonimo = demonimo;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getGini() {
        return gini;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getMoedas() {
        return moedas;
    }

    public void setMoedas(ArrayList<String> moedas) {
        this.moedas = moedas;
    }

    public ArrayList<String> getDominios() {
        return dominios;
    }

    public void setDominios(ArrayList<String> dominios) {
        this.dominios = dominios;
    }

    public ArrayList<String> getFusos() {
        return fusos;
    }

    public void setFusos(ArrayList<String> fusos) {
        this.fusos = fusos;
    }

    public ArrayList<String> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(ArrayList<String> fronteiras) {
        this.fronteiras = fronteiras;
    }

    @Override
    public String toString() {
        return nome +"{ codigo='" + codigo + '\'' +
                ", capital='" + capital + '\'' +
                ", regiao='" + regiao + '\'' +
                ", subRegiao='" + subRegiao + '\'' +
                ", demonimo='" + demonimo + '\'' +
                ", populacao=" + populacao +
                ", area=" + area +
                ", bandeira='" + bandeira + '\'' +
                ", gini=" + gini +
                ", idiomas=" + idiomas +
                ", moedas=" + moedas +
                ", dominios=" + dominios +
                ", fusos=" + fusos +
                ", fronteiras=" + fronteiras +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return 0;
        } else {
            /* java.text.Collator API 1.5
             * A classe Collator executa comparacao de sequencia de caracteres sensivel a localidade.
    	     * Voce usa essa classe para criar rotinas de busca e classificacao de texto em linguagem
    	     * natural.
    	     * Referencias:
    	     * https://docs.oracle.com/javase/7/docs/api/java/text/Collator.html
    	     * http://stackoverflow.com/questions/12889760/sort-list-of-strings-with-localization
    	     * */
            Pais pais = (Pais) o;
            // Collator e uma classe abstrata. Utilize o seu factory para instanciar.
            Collator c = Collator.getInstance();
            // A atribuicao de pontos fortes aos recursos de linguagem depende da regiao.
            c.setStrength(Collator.PRIMARY);
            return c.compare(this.nome, pais.getNome());
            //usar o compareTo nao ordena corretamente caracteres acentuados
            //return getNome().compareTo(pais.getNome());
        }
    }
}
