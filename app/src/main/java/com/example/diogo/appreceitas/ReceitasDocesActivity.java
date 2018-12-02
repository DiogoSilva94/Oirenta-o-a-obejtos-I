package com.example.diogo.appreceitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class ReceitasDocesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas_doces);


        final ArrayList<Receitas> receitas = new ArrayList<>();

        receitas.add(new Receitas("Brownie de Chocolate",
                "500g de chocolate meio amargo picado\n" +
                            "1 3⁄4 xícara (chá) de açúcar\n" +
                            "250ml de água fervente\n" +
                            "1 xícara (chá) de manteiga cortada em cubos\n" +
                            "4 ovos\n" +
                            "1⁄2 xícara (chá) de farinha de trigo Famiglia Venturelli\n" +
                            "1⁄2 colher (sopa) de fermento em pó\n\n",

                "Em um processador coloque o chocolate meio amargo picado e o açúcar, bata bem até formar uma farinha. Com o processador ainda ligado, adicione a água fervente e bata até formar uma calda. Desligue o processador, retire 1 ¼ xícara (chá) dessa calda e reserve. Acrescente no processador a manteiga cortada em cubos, os ovos, a farinha de trigo, ½ colher (sopa) de fermento em pó e bata bem até formar uma massa homogênea. Em uma forma retangular forrada com papel manteiga, adicione a massa de chocolate (feita acima) e leve para assar em forno médio preaquecido a 180°C por +/- 25 minutos. Retire do forno e com a ponta de uma colher de pau faça furos por todo o brownie. Regue a calda de chocolate (reservada acima) preenchendo todos os furos. Deixe amornar. Tire da forma e sirva em seguida com o restante da calda.\n",
                R.drawable.browniedechocolate));


        receitas.add(new Receitas("Rosquinha de Leite Condensado",
                " 3 ovos inteiros\n" +
                            "1 lata leite condensado\n" +
                            "1 colher (sopa) de manteiga ou margarina\n" +
                            "1 colher (sopa) de fermento em pó\n" +
                            "Farinha de Trigo Famiglia Venturelli até dar o ponto;\n",
                "1. Bata no liquidificador, primeiros ingredientes líquidos (leite, ovo e manteiga), depois, adicione a Farinha de Trigo Venturelli, incorporando toda a mistura para que não fique empelotada. A dica essencial Venturelli é temperar a massa com pimenta, alho e depois, salgar.\n\n" +
                        "2. Na frigideira, se não for antiaderente, unte com manteiga antes de colocar a mistura. Coloque de medida uma concha de massa na frigideira, fazendo movimentos circulares para espalhar melhor. Com isso, a massa ficará bem fininha. Em fogo baixo, espere até que a massa descole do fundo. Feito isso, vire-a e deixe fritar do outro lado. E prontinho! Coloque no prato e sirva com o recheio que quiser.\n",
                R.drawable.rosquinhadeleitecondensado));

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


        receitas.add(new Receitas("Coxinha de Doce de Leite e Morango",
                "2 latas de leite condensado\n" +
                        "\n" +
                        "2 xícaras de doce de leite\n" +
                        "\n" +
                        "2 colheres de sopa de creme de leite\n" +
                        "\n" +
                        "2 xícaras de biscoito maria\n" +
                        "\n" +
                        "250g de morangos\n" ,
                "Em uma panela, levar ao fogo o leite condensado e o doce de leite, sempre mexendo até começar a desgrudar do fundo da panela.\n" +
                        "\n" +
                        "Juntar o creme de leite e mexer bem até começar, novamente, a desgrudar do fundo da panela. Dispor em um refratário e reservar para esfriar.\n" +
                        "\n" +
                        "Em um processador, triturar os biscoitos até obter uma farofa. Reservar.\n" +
                        "\n" +
                        "Depois de frio, cobrir os morangos com o brigadeiro de doce de leite.\n" +
                        "\n" +
                        "Passar na farofa de biscoito e levar a geladeira por 2 horas antes de servir..\n" ,

                R.drawable.coxinhamorango));

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
