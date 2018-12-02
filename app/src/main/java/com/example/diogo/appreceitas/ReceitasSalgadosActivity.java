package com.example.diogo.appreceitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class ReceitasSalgadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas_salgados);


        final ArrayList<Receitas> receitas = new ArrayList<>();

        receitas.add(new Receitas("Lasanha à Bolonhesa",
                "3 colheres de manteiga\n" +
                            "3 colheres de manteiga\n" +
                            "4 colheres de Farinha de Trigo Venturelli;\n" +
                            "sal a gosto;\n" +
                            "2 xícaras de leite;\n" +
                            "2 xícaras de creme de leite;\n" +
                            "300 g de carne moída;\n" +
                            "3 xícaras de polpa de tomate;\n" +
                            "3/4 xícara de água quente;\n" +
                            "2 colheres de azeite;\n" +
                            "2 dentes de alho;\n" +
                            "1 cebola picada;\n" +
                            "noz-moscada a gosto;\n" +
                            "250 g de massa para lasanha;\n" +
                            "200 g de mussarela;\n" +
                            "200 g de presunto.\n",

                "1. Molho Bolonhesa \n\n Coloque em uma panela as colheres de azeite, misture o alho e a cebola e mexa até dourar. Acrescente a carne moída até fritá-la, após isso, coloque a polpa de tomate, água e o sal. Deixe cozer até que ferva..\n\n"+
                               "2. Molho Branco\n\n" +
                               "Coloque a manteiga em uma panela e doure a farinha em fogo baixo. É importante mexer sempre. Junte aos pouco o leite e cozinhe até conseguir um molho encorpado e sem pelotas. Acrescente também o creme de leite e tempere com noz-moscada e sal. Reserve.\n\n"+
                               "3. Montagem da lasanha à bolonhesa\n" +
                               "Comece colocando em um recipiente grande uma camada do molho à bolonhesa já feito, a massa lasanha, presunto mussarela e o molho branco. Gradativamente. E para finalizar, já no topo, Adicione mais massa de lasanha, presunto e mussarela. Termine com o molho à bolonhesa. Caso prefira, polvilhe queijo parmesão e leve ao forno para gratinar por, aproximadamente, 20min.\n",
                R.drawable.lasanhabolonhesa));


        receitas.add(new Receitas("Massa de panqueca fininha",
                " 1 xícara (chá) leite;\n" +
                             "1 xícara (chá) Farinha de Trigo Venturelli;\n" +
                             "1 xícara (chá) Farinha de Trigo Venturelli;\n" +
                             "1 colher (sopa) manteiga;\n" +
                             "1 ovo grande;\n",
                "1. Bata no liquidificador, primeiros ingredientes líquidos (leite, ovo e manteiga), depois, adicione a Farinha de Trigo Venturelli, incorporando toda a mistura para que não fique empelotada. A dica essencial Venturelli é temperar a massa com pimenta, alho e depois, salgar.\n\n" +
                               "2. Na frigideira, se não for antiaderente, unte com manteiga antes de colocar a mistura. Coloque de medida uma concha de massa na frigideira, fazendo movimentos circulares para espalhar melhor. Com isso, a massa ficará bem fininha. Em fogo baixo, espere até que a massa descole do fundo. Feito isso, vire-a e deixe fritar do outro lado. E prontinho! Coloque no prato e sirva com o recheio que quiser.\n\n",
                R.drawable.massafinapanquecas));

        receitas.add(new Receitas("Pizza Frita",
                "1 envelope de fermento biológico granulado;\n" +
                            "1 colher (sopa) rasa de sal;\n" +
                            "2 colheres (sopa) de azeite;\n" +
                            "200ml de água;\n" +
                            "5 xícaras de chá de Farinha de trigo Famiglia Venturelli;\n" +
                            "Sugestão de recheio;\n" +
                            "10 fatias grossas de presunto.;\n" +
                            "10 fatias grossas de mussarela.;\n" +
                            "20 fatias finas de tomate.;\n" +
                            "orégano a gosto.\n",


                "Numa tigela coloque o fermento, o sal, o azeite e a água, misture bem. Acrescente 2 xícaras de trigo e deixe descansar por uns 20 minutos. Acrescente à mistura descansada, o restante da farinha de trigo ou até dar ponto para sovar e não grudar nas mãos. Deixe descansar mais uns 30 minutos (ou mais). Abra a massa com o rolo, deixe bem fina, corte em círculos e recheie com meia fatia de presunto e queijo enrolada, o tomate e o orégano, feche como um pastel, apertando muito bem as beiradas. Aqueça o óleo e frite as pizzas. Escorra bem em papel toalha e sirva!\n\n",

        R.drawable.pizzafrita));


        receitas.add(new Receitas("Bolinho de Arooz",
                "2 xícaras de arroz cozido\n" +
                            "1 xícara de espinafre picadinho\n" +
                            "2 ou 3 colheres de farinha de trigo Famiglia Venturelli\n" +
                            "Cheiro verde a gosto\n" +
                            "Claras de ovo para empanar (opcional)\n" +
                            "4 colheres de queijo ralado\n" +
                            "1 pitada de sal\n" +
                            "1 ovo.\n" ,
                    "Misture o arroz com o espinafre. Junte o ovo, a farinha de trigo e misture bem. Acrescente o queijo, o sal e o cheiro verde com uma colher. Coloque a massa na clara (opcional). Depois frite em óleo quente.",

                R.drawable.bolinhodearroz));

        receitas.add(new Receitas("Bolinho de Arroz Assado",

                "1 xícara (chá) de cheiro-verde\n" +
                "2 ovos grandes\n" +
                "1 xícara (chá) de parmesão ralado\n" +
                "1 xícara de (chá) de farinha de trigo FAMIGLIA VENTURELLI\n" +
                "3 xícaras (chá) de arroz cozido\n" +
                "sal e pimenta a gosto\n",
                "Misture todos os ingredientes em uma tigela com o auxílio de uma colher. Aqueça o forno a 200º C, por aproximadamente 10 minutos. Faça os bolinhos com o auxílio de uma colher e unte um refratário. Asse por cerca de 30 minutos.",


                R.drawable.bolinhodearrozassado));
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
