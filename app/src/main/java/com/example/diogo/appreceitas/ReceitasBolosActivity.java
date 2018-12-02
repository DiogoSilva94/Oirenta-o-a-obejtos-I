package com.example.diogo.appreceitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class ReceitasBolosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas_bolos);

        final ArrayList<Receitas> receitas = new ArrayList<>();

        receitas.add(new Receitas("Bolo de Cenoura",
                "1/2 xícara (chá) de óleo\n" +
                        "3 cenouras médias raladas\n" +
                        "4 ovos\n" +
                        "2 xícaras (chá) de açúcar\n" +
                        "2 e 1/2 xícaras (chá) de farinha de trigo\n" +
                        "1 colher (sopa) de fermento em pó\n" +
                        "COBERTURA:\n" +
                        "1 colher (sopa) de manteiga\n" +
                        "3 colheres (sopa) de chocolate em pó\n" +
                        "1 xícara (chá) de açúcar\n" +
                        "1 xícara (chá) de leite\n" ,

                "Em um liquidificador, adicione a cenoura, os ovos e o óleo, depois misture\n" +
                        "Acrescente o açúcar e bata novamente por 5 minutos\n" +
                        "Em uma tigela ou na batedeira, adicione a farinha de trigo e depois misture novamente\n" +
                        "Acrescente o fermento e misture lentamente com uma colher\n" +
                        "Asse em um forno preaquecido a 180° C por aproximadamente 40 minutos\n" +
                        "COBERTURA:\n" +
                        "Despeje em uma tigela a manteiga, o chocolate em pó, o açúcar e o leite, depois misture\n" +
                        "Leve a mistura ao fogo e continue misturando até obter uma consistência cremosa, depois despeje a calda por cima do bolo\n",
                R.drawable.bolocenoura));


        receitas.add(new Receitas("Bolo De Banana De Liquidificador",
                " 3 ovos\n" +
                        "2 xícaras (chá) de açúcar\n" +
                        "1 xícara (chá) de leite\n" +
                        "1/2 xícara (chá) de óleo\n" +
                        "2 xícaras (chá) de farinha de trigo\n" +
                        "1 colher (sopa) de fermento químico\n" +
                        "7 bananas\n" +
                        "COBERTURA:\n" +
                        "3/4 xícara (chá) de açúcar\n" +
                        "1/2 xícara (chá) de água quente\n",
                "COBERTURA:\n" +
                        "Em uma panela, adicione o açúcar e misture até derreter\n" +
                        "Despeje a água quente e mexa até dissolver o açúcar\n" +
                        "Deixe engrossar até chegar ao ponto de calda e reserve\n" +
                        "MASSA:\n" +
                        "Bata no liquidificador os ovos, o açúcar, o óleo e o leite\n" +
                        "Acrescente a farinha de trigo aos poucos e continue batendo até obter uma massa lisa e homogênea\n" +
                        "Adicione por último o fermento e bata na velocidade mínima do liquidificador\n" +
                        "Unte uma forma média com margarina e farinha\n" +
                        "Despeje o caramelo e as bananas cortadas no comprimento\n" +
                        "Leve para assar em forno médio 180º C, preaquecido por aproximadamente 30 minutos\n\n" ,
                R.drawable.bolodebanana));

        receitas.add(new Receitas("Bolo de Chocolate e Café",
                "1 e ½ xícara de chá de açúcar\n" +
                        "2 xícaras de chá de farinha de trigo Famiglia Venturelli\n" +
                        "1 xícara de chá de chocolate em pó\n" +
                        "½ xícara de chá de Leite\n" +
                        "½ xícara de chá de café pronto\n" +
                        "3 ovos\n" +
                        "¼ xícara de chá de manteiga derretida\n" +
                        "½ colher de sopa de fermento químico\n" +
                        "½ colher de sopa de bicarbonato de sódio\n" +
                        "200g de chocolate meio amargo\n" +
                        "1 lata de creme de leite sem soro\n",


                "Para fazer a ganache, derreta o chocolate meio amargo e misture com 1 lata de creme de leite sem soro até a mistura ficar homogênea, leve para gelar por 15 minutos. Para preparar o bolo misturo os ovos, manteiga, leite e café em uma tigela. Acrescente o açúcar e misture até dissolver bem. Adicione o chocolate em pó, farinha de trigo e misture até ficar um massa homogênea. Coloque o fermento e o bicarbonato mexa bastante. Transfira a massa para uma forma untada e enfarinhada e leve para assar em forno pré aquecido a 180°C por cerca de 40 minutos ou até fazer o teste do palito e ele sair limpo.\n\n",

                R.drawable.bolodechocolateecafe));


        receitas.add(new Receitas("Bolo Simples",
                "2 xícaras (chá) de açúcar\n" +
                        "3 xícaras (chá) de farinha de trigo Famiglia Venturelli\n" +
                        "4 colheres (sopa) de margarina\n" +
                        "3 ovos\n" +
                        "1 e 1/2 xícara (chá) de leite\n" +
                        "1 colher (sopa) bem cheia de fermento em pó\n",
                "Bata as claras e reserve. Misture a margarina, o açúcar e as gemas até obter uma massa homogênea.\n" +
                        "Sem parar de bater, acrescente a farinha de trigo e o leite aos poucos. Por fim, adicione as claras em neve e o fermento. Em uma forma grande com furo central untada e enfarinhada, despeje a massa. Asse em forno médio 180ºC por aproximadamente 40 minutos e seu bolo simples estará pronto. Sirva com um cafézinho!",

                R.drawable.bolosimples));

        receitas.add(new Receitas("Mini Bolo de Churros",

                "150 gramas de MANTEIGA SEM SAL em temperatura ambiente\n" +
                        "140 gramas de AÇÚCAR REFINADO\n" +
                        "2 OVOS\n" +
                        "80 ml de LEITE morno\n" +
                        "250 gramas de FARINHA DE TRIGO FAMIGLIA VENTURELLI peneirada\n" +
                        "1 colher (de chá) de SAL\n" +
                        "2 colheres (de chá) de FERMENTO QUÍMICO\n" +
                        "1 colher (de sopa) de CANELA\n" +
                        "1 colher (de sopa) de ESSÊNCIA DE BAUNILHA\n"  ,
                "1. Unte e enfarinhe a(s) forma(s) do bolo.\n" +
                        "2. Em uma tigela, peneire junto a farinha, o sal, o fermento e a canela. Reserve.\n" +
                        "3. Pré-aqueça o forno a 180 graus.\n" +
                        "4. Acrescente a manteiga e o açúcar na batedeira e bata bem até que vire um creme fofo e esbranquiçado. Em uma batedeira planetária (de alta potência) esse processo leva cerca de 10 minutos.\n" +
                        "DICA: é preciso bater bem a manteiga e o açúcar para que o bolo fique macio.\n" +
                        "5. Enquanto isso, amorne o leite.\n" +
                        "6. Adicione os ovos, um a um, à mistura de manteiga e bata bem até incorporar.\n" +
                        "7. Adicione metade da mistura dos secos, intercalando com o leite morno. Mas não bata muito, somente até incorporar os secos.\n" +
                        "8. Quando o leite terminar, adicione a essência de baunilha e bata só até tudo se misturar.\n" +
                        "9. Distribua a massa nas forminhas untadas, até 2/3 de sua capacidade.\n" +
                        "10. Leve para assar por aproximadamente 20 minutos ou até que você coloque o palitinho no meio do bolo e ele saia limpinho. Como são mini bolinhos, talvez não corem muito, cuidado para não ressecar a massa.\n" +
                        "11. Espere o bolo esfriar para desenformar.\n" +
                        "12. Quando frios, passe os bolinhos na mistura de açúcar e canela e recheie com o doce de leite.",

                R.drawable.minibolodechurros));
        final ReceitasAdapter adapter = new ReceitasAdapter(this, receitas);
        ListView lista = (ListView) findViewById(R.id.listaReceitas);
        lista.setAdapter(adapter);

        final Intent intent = new Intent(getApplicationContext(), ReceitasActivity.class);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Receitas receitas = (Receitas) adapterView.getItemAtPosition(i);
                intent.putExtra("receitas", (Serializable) receitas);
                startActivity(intent);
            }
        });


    }
}
