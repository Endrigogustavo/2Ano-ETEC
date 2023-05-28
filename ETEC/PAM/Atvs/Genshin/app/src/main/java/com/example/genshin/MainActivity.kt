package com.example.genshin


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.genshin.ui.theme.GenshinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GenshinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.background(Blue)

                ) {
                   Scrolling()
                }
            }
        }
    }
}

@Preview
@Composable
fun Scrolling(modifier: Modifier = Modifier) {

    Column(modifier.verticalScroll(rememberScrollState()).background(Color(26, 68, 153, 255))) {
        Column {


        Row(modifier = modifier.horizontalScroll(rememberScrollState())) {
            Image(
                painter = painterResource(R.drawable.nilou),
                contentDescription = "Contact profile picture",
                modifier = Modifier

                    // Set image size to 40 dp
                    .size(411.dp)


            )

            Image(
                painter = painterResource(R.drawable.kakami),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(411.dp)

            )


            Image(
                painter = painterResource(R.drawable.nahida),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(411.dp)

            )


            Image(
                painter = painterResource(R.drawable.yao),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(411.dp)


            )

        }

    }


    Text("               Hyperbloom", fontWeight = FontWeight.Bold, fontSize = 30.sp, color = Color.White, modifier = Modifier .padding(10.dp))
        Text("         é uma reação causada pela aplicação de Electro a um núcleo de Dendro. As composições de equipe baseadas em Hyperbloom  incluem personagens Dendro, Hydro e Electro, muitas vezes com um Anemo ou quarto slot flex. \n\n" +
                "        Hyperbloom cria uma explosão com uma pequena AoE, que às vezes pode danificar o jogador se estiver perto. O dano de hiperbloom é calculado com base no Domínio Elemental do personagem Electro que desencadeia a reação.",
                fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)


        Row(modifier = modifier.horizontalScroll(rememberScrollState())) {
            Image(
                painter = painterResource(R.drawable.nilou11),
                contentDescription = "Contact profile picture",
                modifier = Modifier

                    // Set image size to 40 dp
                    .size(130.dp)


            )

            Image(
                painter = painterResource(R.drawable.kokk),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(130.dp)

            )


            Image(
                painter = painterResource(R.drawable.nahida2),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(130.dp)

            )


            Image(
                painter = painterResource(R.drawable.yao2),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(130.dp)

            )

        }
        Text("Núcleo Dendro\n" +
                "Se a duração de um Dendro Core expirar, ele explodirá, causando AoE Dendro DMG em um raio de 5m para inimigos e jogadores.\n" +
                "\n" +
                "Se Pyro for infligido a um Dendro Core, a reação Burgeon será acionada, que consome o Dendro Core e causa aumento de AoE Dendro DMG em um raio de 5m para inimigos e jogadores.\n" +
                "\n" +
                "Se o Electro for infligido a um Dendro Core, a reação Hyperbloom será acionada, que transforma o Dendro Core em um Sprawling Shot que atinge o inimigo mais próximo (ou aliado, se acionado por um inimigo/ambiente), causando aumento de AoE Dendro DMG em um raio de 1m ao atingir inimigos e jogadores.\n" +
                "\n" +
                "O DMG causado aos jogadores por todas as reações relacionadas a Bloom é de 5% do DMG causado aos inimigos, não importa qual parte desencadeie a reação.\n" +
                "\n" +
                "Burgeon e Hyperbloom podem ser ativados por um grupo diferente daquele que ativou o Bloom original, incluindo o ambiente e sua escala de dano com as estatísticas do responsável pela aplicação de Pyro ou Electro.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)


        Text("núcleo abundante\n" +
                "Certas habilidades de personagem e buffs de eventos farão com que a reação de Bloom produza núcleos abundantes em vez de núcleos Dendro. Bountiful Cores explodem 0,4 segundos após sua criação, causando AoE Dendro DMG em um raio de 6,5 m para inimigos e jogadores. DMG dado aos jogadores é 5% do DMG dado aos inimigos.\n" +
                "\n" +
                "Burgeon e Hyperbloom não podem ser acionados em Bountiful Cores. Bountiful Cores compartilham o limite superior de 5 com Dendro Cores regulares." +
                "" +
                "Dano\n" +
                "Observe que um alvo pode receber apenas 2 instâncias de DMG de cada reação relacionada a Bloom a cada 0,5 segundos, conforme limitado pela Sequência de Dano . Observe que as explosões do Dendro Core e as explosões do Bountiful Core também são contadas separadamente.\n" +
                "\n" +
                "Florescer\n" +
                "Bloom DMG é calculado como\n" +
                "2\n" +
                "×\n" +
                "Multiplicador de Nível\n" +
                "{\\displaystyle 2\\vezes {\\text{Nível Multiplicador}}}. Os multiplicadores de nível para cada nível podem ser encontrados em Level Scaling/Reaction#Level Multiplier .\n" +
                "\n" +
                "Bloom DMG é afetado apenas pelo nível e Maestria Elemental do personagem que está causando a reação, e o Dendro RES do alvo . Ele ignora a DEF do alvo e não pode causar Golpes Críticos . O Elemental Mastery DMG Bonus e o multiplicador de Resistência do alvo são aplicados multiplicativamente com o Base DMG.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)

        Image(
            painter = painterResource(R.drawable.ni),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // Set image size to 40 dp
                .size(150.dp)
                .padding(20.dp)
                .align(alignment = CenterHorizontally)
        )

        Row(modifier = modifier.align(alignment = CenterHorizontally).horizontalScroll(rememberScrollState())) {

            Image(
                painter = painterResource(R.drawable.eeeeeeeeeeeeeeeee),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)

            )

            Image(
                painter = painterResource(R.drawable.rrrrrrrrrrrrrrrrrrr),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)

            )

            Image(
                painter = painterResource(R.drawable.ttttttttttttttttt),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)

            )

            Image(
                painter = painterResource(R.drawable.t1),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)

            )
            Image(
                painter = painterResource(R.drawable.t2),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)

            )

        }
        Text("Informações de Combate\n" +
                "Nilou é uma personagem de suporte que pode alterar o efeito de Reações Elementais para beneficiar a equipe sob determinadas condições.\n" +
                "\n" +
                "Através de sua Habilidade Elemental, ela pode executar diferentes movimentos de dança, causando Dano Hydro ou aplicando o estado Molhado no inimigo; Ela também pode usar seu Supremo para causar Dano Hydro aos inimigos próximos.\n" +
                "\n" +
                "Quando todos os personagens da equipe são de um Tipo Elemental específico, Nilou também pode usar sua Habilidade Elemental para conceder a todos os membros próximos da equipe o estado \"Recompensa do Cálice Dourado\". Quando um personagem neste estado desencadeia a Reação de Florescimento, ele produzirá um \"Núcleo da Riqueza\" que pode explodir rapidamente e causar dano em uma AdE.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)

        Text("Ataque Normal\n" +
                "Realiza até 3 golpes rápidos.\n" +
                "\n" +
                "Ataque Carregado'\n" +
                "Consome uma certa quantidade de Stamina para desferir um golpe giratório.\n" +
                "\n" +
                "Ataque Imersivo\n" +
                "Mergulha em pleno ar para golpear o chão, causando dano aos inimigos ao longo do caminho e infligindo Dano em uma AdE durante o impacto.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)

        Text("Entra no estado de \"Pirueta\", infligindo Dano Hydro baseado na Vida Máxima de Nilou.\n" +
                "Enquanto estiver no estado de Pirueta, ao desferir Ataques Normais ou lançar sua Habilidade Elemental, Nilou entrará nas posições \"Dança de Espadas\" e \"Dança Rodopiante\" respectivamente, fazendo com que o Dano infligido seja convertido em Dano Hydro que não pode ser substituído, e é considerado Dano de Habilidade Elemental.\n" +
                "\n" +
                "Nesse estado, o terceiro passo da dança de Nilou eliminará o estado de Pirueta e, de acordo com o tipo do terceiro passo, desencadeará os seguintes efeitos:\n" +
                "Dança de Espadas: lança uma Lua Aquática, que inflige Dano Hydro contra os inimigos que atinge e faz Nilou entrar no estado \"Súplica Lunar\". Nesse estado, ao realizar Ataques Normais, eles serão convertidos em Dança de Espadas e, ao realizar o último ataque, será lançada uma Lua Aquática;\n" +
                "Dança Rodopiante: lança uma Roda d'Água, infligindo Dano Hydro em AdE, e gerando uma \"Aura da Tranquilidade\" que segue o personagem ativo, continuamente aplicando o estado Molhado aos oponentes.\n" +
                "\n" +
                "Enquanto Nilou estiver no estado de Pirueta ou da Súplica Lunar, ela não poderá desferir Ataques Carregados; esses estados serão eliminados quando Nilou sair do campo de batalha.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)

        Text("Inicia a Dança da Nascente Longínqua Onírica, desabrochando a Lótus de Águas Longínquas, que inflige Dano Hydro em AdE baseado na Vida Máxima de Nilou e aplicando o estado \"Inundação Eterna\" aos inimigos atingidos.\n" +
                "Após um curto intervalo, inimigos sob o estado Inundação Eterna sofrerão Dano Hydro.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)

        Image(
            painter = painterResource(R.drawable.n),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // Set image size to 40 dp
                .size(150.dp)
                .padding(20.dp)
                .align(alignment = CenterHorizontally)
        )

        Row(modifier = modifier.align(alignment = CenterHorizontally).horizontalScroll(rememberScrollState())) {

            Image(
                painter = painterResource(R.drawable.aaaa),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)

            )

            Image(
                painter = painterResource(R.drawable.dddd),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)
            )

            Image(
                painter = painterResource(R.drawable.sssss),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)
            )

            Image(
                painter = painterResource(R.drawable.tn),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(100.dp)
                    .padding(10.dp)

            )
        }
        Text("   Informações de Combate\n" +
                "        Nahida é uma personagem Dendro que pode criar condições para Reações Elementais Dendro e causa dano mesmo quando está fora do campo de combate.\n" +
                "\n" +
                "        Ela pode usar sua Habilidade Elemental para marcar os oponentes com a Semente Skandha, onde oponentes marcados dentro de um alcance fixo um do outro serão conectados uns aos outros. Depois de ativar as Reações Elementais nos oponentes afetados pela Semente Skandha ou quando recebem Dano dos Núcleos Dendro, Nahida causará Dano Dendro ao oponente e a todos os outros oponentes conectados.\n" +
                "\n" +
                "        Seu Supremo cria o campo \"Santuário de Maya\", que de acordo com o número de personagens dos tipos elementais Pyro/Electro/Hydro na equipe, fornece um determinado efeito bônus para Nahida.\n",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)


        Text("taque Normal\n" +
                "Realiza até 4 ataques que infligem Dano Dendro.\n" +
                "\n" +
                "Ataque Carregado\n" +
                "Consome uma certa quantidade de Stamina para infligir Dano Dendro em uma AdE após um curto período de canalização.\n" +
                "\n" +
                "Ataque ImersivoReunindo o poder do Dendro, mergulha em direção ao chão em pleno ar, infligindo dano a todos os inimigos em seu caminho. Inflige Dano Dendro em uma AdE durante o impacto com o chão.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)

        Text("Pressionar\n" +
                "Envia vínculos cármicos de madeira e árvore a partir de seu lado, infligindo Dano Dendro em uma AdE e marcando até 8 oponentes atingidos com a Semente Skandha.\n" +
                "Quando usada no modo Manter Pressionado, essa habilidade será acionada de maneira diferente.\n" +
                "\n" +
                "Manter Pressionado\n" +
                "Entra no modo de mira, que permite escolher um certo número de oponentes dentro de uma certa AdE. Durante esse tempo, a Resistência contra Interrupção de Nahida será aumentada.\n" +
                "Quando o modo de mira acabar, essa habilidade causará Dano Dendro a esses oponentes e os marcará com a Semente Skandha.\n" +
                "O modo de mira durará até 5s e pode selecionar no máximo 8 oponentes.\n" +
                "\n" +
                "Semente Skandha\n" +
                "Oponentes que foram marcados pela Semente Skandha serão conectados uns aos outros até uma certa distância.\n" +
                "Depois de causar Reações Elementais em oponentes afetados pelas Sementes Skandha e quando eles recebem Dano de Núcleos Dendro (incluindo Dano de Germinação e Superflorescimento), Nahida irá liberar a Purificação Tricármica nesses oponentes e em todos os oponentes conectados, causando Dano Dendro com base em seu ATQ e Proficiência Elemental.\n" +
                "Só é possível ativar até 1 Purificação Tricármica dentro de um curto período de tempo.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)


        Text("Se houverem personagens dos tipos elementais abaixo quando o campo é criado, gera os seguintes efeitos:\n" +
                "Pyro: quando Nahida está no Santuário de Maya, aumenta o Dano infligido por Purificação Tricármica de sua Habilidade Elemental “Esquemas Universais”;\n" +
                "Electro: quando Nahida está no Santuário de Maya, reduz o intervalo para desencadear Purificação Tricármica de sua Habilidade Elemental “Esquemas Universais”;\n" +
                "Hydro: estende a duração do Santuário de Maya.\n" +
                "\n" +
                "Ao criar esse campo, se houverem pelo menos 2 personagens dos tipos elementais citados acima, o efeito correspondente será mais fortalecido.\n" +
                "\n" +
                "Mesmo que Nahida não esteja ativa no campo de batalha, poderá obter os efeitos de aumento descritos acima se membros da equipe estiverem dentro do Santuário de Maya.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)


    }

}











