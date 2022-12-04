import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("                                                  OS VIAJANTES ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Você está prestes a encarar uma nova jornada.\n");
        Thread.sleep(5000);
        System.out.println("Dois irmãos gêmeos, Lumine e Aether, que viajavam entre mundos, em busca de novas experiências e combater o mal, durante uma de suas viagens, foram interrompidos por uma deusa desconhecida.");
        System.out.println("Depois de serem interrompidos, os gêmeos gritaram:");
        System.out.println(" - Quem é você?");
        System.out.println(" - Eu sou a deusa que irá acabar com a arrogância humana e destruir os mundos, 1 por 1. - Exclamou a divindade desconhecida.\n");
        System.out.println("Após isso, uma luta foi cravada e o combate entre deusa e gêmeos se iniciou. Após certo tempo de luta incessante, a deusa lança uma magia de selo, com o intuito de prender os gêmeos");
        Thread.sleep(3000);
        // A partir deste momento, após escolher um dos irmãos gêmeos, todo o seu destino será mudado, escolha com sabedoria.

        // 1º Divisão de caminhos
        String viajantes;
        Scanner gemeos = new Scanner(System.in);
        System.out.println(" Escolha um dos Gêmeos: Aether (Masculino) ou Lumine (Feminino)");
        viajantes = gemeos.nextLine();
        if (viajantes.equals("Aether")) {
            Thread.sleep(3000);
            System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("No momento que a magia de selo foi lançada, Aether brandiu a sua espada, e o pingente de cristal refletiu, no qual, toda a magia de selo se voltou contra Lumine...");
            System.out.println("- SOLTE A MINHA IRMÃ!!!!! - Exclamou Aether\n");
            System.out.println(" Após gritar com toda sua força, implorando para que a divindade libertasse sua irmã, Aether avança em direção a deusa, no qual ela usa sua magia, e sela todo poder mágico do Aether juntamente com suas antigas memórias...");
            System.out.println(" Após isso a divindade abre um portal e lança Aether para esse portal, levando-o para um mundo desconhecido, chamado Teyvat.");
            Thread.sleep(4000);
            System.out.println(" Após passar um longo período desacordado, Aether acorda, sem lembrar de praticamente nada, apenas que uma deusa selou e levou sua irmã.");
            Thread.sleep(3000);
            System.out.println(" Sem poderes, apenas uma espada sem magia, sem rumo, apenas a determinação de reencontrar e salvar a sua irmã");
            System.out.println(" Após vagar por um tempo no mundo desconhecido, a fome chega, e Aether prentende pescar, com uma vara feita com galho de árvores, linha de seu cachecol e um pequeno alfinete que estava em sua mochila.");
            System.out.println(" Aether lança com toda a sua força a isca, em busca de alimentos, quando ele captura uma fada estranha que estava inconsciente");
            System.out.println(" O que você deseja fazer? Salvar a fada? Ou apenas ignorar e continuar em busca de comida? Digite Salvar ou Ignorar");
            viajantes = gemeos.nextLine();

            //Introduzindo a segunda múltipla escolha
            if(viajantes.equals("Salvar")){
                System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Aether carrega a fada até uma rocha plana e começa a usar as técnicas de reanimação para tentar salvar a fada.");
                System.out.println("A fada cospe bastante água e abre os olhos, pouco tempo depois, ela fala:");
                Thread.sleep(3000);
                System.out.println("Me chamo Paimon, sou a fada das direções e dos caminhos. Em forma de gratidão, irei te guiar pelo mundo de Teyvat.");
                System.out.println("Paimon pergunta sobre Aether, ele conta as únicas coisas que restaram de sua memória para a fada.");
                System.out.println(" - Entendi toda a situação. Prometo que estarei sempre ao seu lado, durante a sua jornada em busca da sua irmã! - disse Paimon, com uma forte convicção.");
                Thread.sleep(3000);
                System.out.println("Após um caloroso abraço, Aether e Paimon seguiram viagem durante a floresta, no qual encontraram duas estradas que levavam a caminhos distintos.");
                System.out.println("O primeiro caminho, aparentava estar cheio de frutas, rios repletos de peixes, o segundo caminho era um caminho repleto de folhas secas e rochas.");
                System.out.println("Cego pela fome, Aether quer seguir caminho para o bosque frutífero. Porém, Paimon ao chegar em frente ao mesmo, sente que tudo não passa de uma ilusão, e que se trata de magia sombria do Abismo das Trevas. ");
                System.out.println(" - Iremos pelo outro caminho. - Exclamou Paimon");
                System.out.println(" - Mas porquê? Aqui teremos bastante suprimentos para sobreviver durante dias, ou até meses!!! - indagou o viajante desconformado.");
                System.out.println(" - Te explicarei durante o caminho. Confia em mim, por aqui tem coisa errada...");
                System.out.println("Mesmo desconformado, Aether faz o que Paimon pede, e seguem viagem pelo caminho rochoso. Após horas de viagens, a recompensa finalmente foi alcançada!!");
                System.out.println(" O viajante encontra uma das >> ESTÁTUAS DAS SANTIDADES<< e logo após a estátua, uma pequena cidade povoada");
                System.out.println("Aether se apróxima da estátua e a toca. Uma sensação calorosa e sensação de libertação preenche o seu corpo...");
                Thread.sleep(5000);
                System.out.println("Aether fecha os olhos e começa a flutuar. Após o toque na estátua, o viajante recebe a benção da santidade e o foi concebido o poder de manipular o ar, onde ele pode usar para combate, ou ate mesmo defesa.");
                Thread.sleep(5000);
                System.out.println("Eu sempre senti que você era poderoso! Agora com esses poderes, as chances de encontrarmos a sua irmã será bem maior!");
                System.out.println("Logo após esses acontecimentos, mais a frente eles encontram uma taverna, e conseguem fazer uma refeição saudável!");
                System.out.println("Após saírem da Taverna, eles conseguiram a informação com o garçom para chegar na cidade mais próxima, chamada Mondstadt.");
                System.out.println(" - Aether! O que você quer fazer? Ir para a cidade? Ou seguir seu próprio caminho? - Disse Paimon, bastante empolgada.");
                System.out.println(" Digite Ir para cidade ou Seguir caminho.");
                viajantes = gemeos.nextLine();
                // Introduzindo a terceira múltipla escolha, e os primeiros finais.
                if(viajantes.equals("Ir para cidade")){
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println(" - Êba!! Vamos conhecer Mondstadt!!!! - Paimon grita de felicidade!");
                    System.out.println(" Chegando em Mondstadt, Aether conversa com Paimon, e ele toma a decisão de entrar para a guilda de aventureiros.");
                    System.out.println(" Entrando na guilda, Aether iria conseguir novas experiências, ao mesmo tempo, procuraria informações da sua irmã, e da divindidade desconhecida que os atacaram.");
                    System.out.println(" Feito isso, Aether consegue entrar na guilda de aventureiros, e começa uma longa jornada em busca da sua irmã.");
                    System.out.println(" Ele faz muitos novos amigos, que decidem o acompanhar e viajar com ele, em busca de encontrar Lumine e viver novas experiências.");
                    System.out.println(" Quais aventuras esperam por Aether e amigos? Veremos futuramente! =D");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                           FIM                                                             ");
                    // Primeiro Final - Final real
                }
                else if(viajantes.equals("Seguir caminho")){
                    System.out.println("Apesar de terem recebido informações, Paimon e Aether decidem seguir rumo a encontrar novas Estátuas das Santidades, em busca de reunir mais poderes elementais, para assim, combater a divindade misteriosa.");
                    System.out.println("A dupla decide se aventurar, conseguindo informações passando por pequenos vilarejos que encontravam nos caminhos, sempre em busca de estátuas e informações sobre o Abismo das Trevas.");
                    System.out.println("Após conseguir diversas informações, o viajante consegue o poder de vários elementos, e uma possível entrada para adentrar o Irmnsul, a entrada para o Abismo das Trevas.");
                    System.out.println("Sendo assim, Paimon e Aether embarcam uma nova aventura, em busca de Lumine, por dentro do Abismo das Trevas. ");
                    System.out.println("Será que a Divindade faz parte do Abismo das Trevas? Aether conseguirá novas informações? Apenas o futuro nos dirá! =D");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                           FIM                                                             ");
                    // Final Alternativo - Final bom
                }
            }
                

            else if (viajantes.equals("Ignorar")) {
                System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                Thread.sleep(3000);
                System.out.println("Aether carrega a fada até uma rocha plana, começa a usar as técnicas de reanimação, mas a impaciência era maior, então ele a deixou na rocha e seguiu viagem.");
                System.out.println("A estranha fada acorda sem entender o que aconteceu, e volta para sua terra natal.\n");
                System.out.println("Inconformado por não ter conseguido comida pescando, Aether seguiu viagem, numa floresta no qual encontraram duas estradas que levavam a caminhos distintos.");
                System.out.println("O primeiro caminho, aparentava estar cheio de frutas, rios repletos de peixes, o segundo caminho era um caminho repleto de folhas secas e rochas.");
                System.out.println("Sem pensar duas vezes, Aether segue pelo caminho da estrada frutífera.");
                System.out.println("Ele come uma fruta que nem se quer conhece. Pouco tempo depois, ele se sente mal e adormece.\n");
                Thread.sleep(3000);
                System.out.println("Ao acordar, ele se encontra desarmado, e preso numa gaiola, rodeado de magos e feiticeiros do Abismo das Trevas.");
                System.out.println("Os feiticeiros reconheciam que Aether não se tratava de um humano comum, eles iniciaram um ritual, com o intuito de transformar Aether em um Feiticeiro do Abismo Obscuro...");
                System.out.println("Aether resistiu... Ele tentou não sucumbir as trevas... Deu tudo de si... Mas ele estava rodeado de uma legião de Magos e Feiticeiros...");
                Thread.sleep(5000);
                System.out.println("Todas as memórias que restavam foram apagadas. O viajante sucumbiu as trevas e não restava mais humanidade em seu coração. Ele se tornou um Mago das Trevas de Alto Nível.");
                Thread.sleep(3000);
                System.out.println("Aether já não existia mais... Lumine foi esquecida e nunca mais será buscada...");
                System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                System.out.println("                                                      FIM                                                                  ");
            // Final da História - Final "Ruim"
            }
            }
            

        
        else if (viajantes.equals("Lumine")) {
                System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("No momento em que a magia de selo foi lançada, Lumine usa sua magia de reflexão, para tentar selar a divindade com sua propria mágia.\n");
                Thread.sleep(3000);
                System.out.println("Mal sabia Lumine que a divindade não seria afetada, e além disso, a deusa usou a magia refletida e acabou selando Aether e todo seu poder mágico.");
                System.out.println("- SOLTE O MEU IRMÃO!!!!! - Exclamou Lumine");
                System.out.println("Lumine avança furiosa em direção a divindade, na qual, a mesma abre um portal, e joga Aether num portal que o leva a um mundo desconhecido...");
                System.out.println(" - NÃÃÃÃÃÃÃÃÕ!!!!!!! - grita Lumine");
                Thread.sleep(3000);
                System.out.println(" - Agora seu irmão está em outra dimensão, que apenas EU tenho conhecimento. Agora cabe a VOCÊ se quer protegê-lo ou não... - Com bastante calma e serenidade exclamou a divindade. ");
                System.out.println(" - Venha comigo e me sirva, ou farei você assistir a morte do seu irmão junto com a dimensão que ele se encontra e em seguida você encontrará o seu caminho para a morte");
                System.out.println("O que você pretende fazer?: Servir a Deusa, Assistir a morte, Enfrentar a Deusa?");
                viajantes = gemeos.nextLine();
                // Introduzindo a segunda múltipla escolha
                if (viajantes.equals("Assistir a morte")) {
                    System.out.println(" Você tem certeza disso? :o");
                    Thread.sleep(3000);
                    System.out.println(".");
                    Thread.sleep(3000);
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("- Eu sempre odiei Aether, odiava estar ligada a ele em tudo, e agora finalmente uma oportunidade de me livrar dele apareceu. - Falou Lumine com um sorriso estranho.");
                    System.out.println("A Deusa desconhecida gargalha e fica sem acreditar nas palavras que Lumine falou.\n");
                    System.out.println("Achas mesmo que irei acreditar num blefe desses? Se quer realmente seu irmão morto, destrua você mesma, te darei o poder para isso.");
                    System.out.println("Então, a deusa desconhecida transfere poder demoníaco no corpo de Lumine, e a enche de magia obscura.");
                    Thread.sleep(3000);
                    System.out.println("- Me sinto poderosa, o poder reina em mim! - Exclama Lumine.");
                    System.out.println("A deusa abre um portal para que Lumine lance a magia e destrua Aether e a sua nova dimensão.");
                    System.out.println("Lumine destrói a dimensão com um piscar de olhos. A Deusa apenas gargalha e diz:");
                    Thread.sleep(3000);
                    System.out.println("- Una-se a mim, e se torne uma deusa da destruição comigo, juntas seremos extremamente poderosas");
                    System.out.println("O que a deusa não sabia, era quão poderosa Lumine era, antes de se tornar uma só com poder demoníaco.");
                    System.out.println("Usando uma mistura de Poder Demoníaco com o poder de Reflexão, Lumine ataca a deusa, e a prende entre 4 espelhos demoníacos de reflexão");
                    System.out.println("HAHAHAHAHAHHAHAHAHAHAHA - Gargalhou Lumine.");
                    System.out.println("- MALDITA! E-EU TE SUBESTIMEI! EU RETORNAREI E TE MATAREI SUA DESGRAÇADA! - Gritou a deusa desesperada.");
                    System.out.println("Lumine esmaga a deusa com seus espelhos, e diz:");
                    System.out.println("- EU SOU A NOVA PERSONIFICAÇÃO DO MAL, EU IREI DESTRUIR TODOS AQUELES QUE TENTAREM ME IMPEDIR, SEREI A NOVA GOVERNANTA DO MUNDO! HAHAHAHAHA");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                           FIM                                                             ");
                    // Final Plot Twist que vai de 0-1000 em pouco tempo.


                }
                else if(viajantes.equals("Servir a Deusa")) {
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("- Por favor, não machuca meu irmão, eu irei com você, faça o que quiser comigo, mas por favor, não o machuque!! - Exclamou Lumine, chorando.");
                    System.out.println("- Muito bem, mocinha obediente. Vocês já me causaram problemas demais. Estou cansada. Mas, por precaução, irei remover todas as suas lembranças, e implantar em sua memória desprezo.");
                    System.out.println("-Tudo que você sentirá pelo seu irmão será desprezo.");
                    Thread.sleep(3000);
                    System.out.println("Lumine cai no chão, e acorda com um olhar triste. Após isso, ela entra em um portal, e segue a deusa a caminho da sua dimensão.\n");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> TEMPOS DEPOIS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
                    Thread.sleep(3000);
                    System.out.println("Se passaram vários dias, onde os servos da deusa Kai'sair seguem torturando e testando Lumine, para entender a origem dos seus poderes.");
                    System.out.println("A intenção é conseguir uma forma de roubar essa magia para que a deusa possa usar para si, durante suas destruições.");
                    System.out.println("Em quanto isso no palácio de Kai'sair...\n");
                    Thread.sleep(3000);
                    System.out.println("-Mestra, ainda não conseguimos informações sobre a origem do poder da humana. - Disse um servo de Kai'sair");
                    System.out.println("-Seus imprestáveis, eu sempre soube que eu nunca deveria ter poupado a vida de vocês. Tratem de achar uma maneira de descobrir, ou eu irei exterminar todos vocês.");
                    System.out.println("A deusa empurra o servo, usando magia, que o faz chocar contra a parede. Depois o servo sai correndo e vai embora.");
                    System.out.println("-S-sim senhora.");
                    System.out.println("Esse servo se dirige ao seu quarto, que fica próximo ao de Lumine. Lumine escuta os planos do servo, para tentar fugir de lá.\n");
                    System.out.println("Lumine então cochicha baixinho pela brecha da porta de seu quarto:");
                    System.out.println("- Ei, por favor, deixe-me ir com você.");
                    System.out.println("- Quem você pensa que é pra falar assim comigo humana? Cale-se e volte pro seu canto.");
                    System.out.println("Lumine volta desapontada, se deita na cama e adormece.");
                    System.out.println("Após esse acontecimento, o servo ficou pensativo, e chegou uma conclusão:");
                    System.out.println("- Levar essa humana não seria uma má ideia, seria uma forma de afetar os planos de Kai'sair. Pensarei numa forma de escapar...");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Tempos depois, Lumine escuta um barulho na porta velha de seu quarto.");
                    System.out.println("- Rapido, levante-se teremos apenas uma chance. - Murmurou o servo");
                    System.out.println("Lumine levanta sonolenta e vê o servo");
                    System.out.println("Lumine e o servo vão até fora do palácio, as escondidas, onde chegam proxímos a ponte que dá acesso ao palácio, onde lá possui uma barreira.");
                    System.out.println("- Há uma brecha na barreira que nos leva para a outra dimensão, cabe a você decidir se confia em mim, quebra a barreira e pula comigo, ou volta para o seu quarto.- Disse o Servo");
                    System.out.println("O que você vai fazer? Digite Fugir ou Ficar");
                    viajantes = gemeos.nextLine();
                    if (viajantes.equals("Fugir")) {
                        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        Thread.sleep(3000);
                        System.out.println("- Vou com você! - Disse Lumine, determinada.");
                        System.out.println("Então, o servo lança uma cortina de fumaça para que os outros que estivessem ao redor, e ouvissem o barulho, não conseguissem enxergar o que se tratava.");
                        System.out.println("Ao usar uma magia de explosão, a barreira e quebrada, o servo abre um portal, no qual os dois pulam.");
                        System.out.println("- Vamos nessa! FINALMENTE LIVRE - disse o Servozn");
                        Thread.sleep(3000);
                        System.out.println("Dentro dos portais, Lumine sente a presença do seu irmão, apesar de estar sentindo desprezo por ele, devido a magia de Kai'sair, ela segue em rumo ao local onde ela sentiu a presença. ");
                        System.out.println("Ela pensou: - Preciso entender o porquê deste sentimento estar em meu peito. Preciso encontrar Aether");
                        System.out.println("Então, num momento de distração do servo, dentro dos caminhos dos portais, Lumine corre e salta");
                        System.out.println("- EI!!! HUMANA MALDITA!! ONDE VOCÊ PENSA QUE VAI??? Que droga... Aquela inútil... Não era isso que estava em meus planos, mas tudo bem, minha missão foi cumprida. - Disse o servo");
                        System.out.println("Lumine caí, em uma cidade, extremamente distante, praticamente abandonada. Lá ela toma a decisão de que vai tentar encontrar o irmão seguindo a presença dele.\n");
                        Thread.sleep(3000);
                        System.out.println("Uma nova jornada se inicía para Lumine, sem poderes, rumo em encontrar seu irmão e tentar entender tudo o que aconteceu.");
                        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("                                                        FIM                                                                ");
                        // Final Real - Bom
                    }
                    else if (viajantes.equals("Ficar")){
                        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        Thread.sleep(3000);
                        System.out.println(" - O que você pretende fazer é uma loucura! Ela com certeza iria nos achar, é impossível escaparmos! - Exclamou Lumine.");
                        System.out.println(" - Sua Tola! Essa é a única oportunidade que você tem e você joga no lixo? - Disse o Servo.");
                        System.out.println(" - Se ela conseguir nos alcançar, ela vai tentar fazer algo com meu irmão, não posso permitir que ele se machuque, mesmo sem saber porquê tenho esse sentimento de desprezo em relação a ele. - Diz Lumine.");
                        System.out.println(" - Tudo bem então sua babaca, então apodreça aí, estou indo embora, até nunca mais, FINALMENTE LIVRE!!! - gritou o Servo.");
                        System.out.println(" Após uma explosão, devido ao uso de magia, o servo escapa, Lumine fica, logo em seguida, outros servos seguem e prendem Lumine.");
                        System.out.println(" Por conta da tentativa de fuga de Lumine, Kai'sair decide selar Lumine, colocando-a em um sono profundo, até que ela encontre algum meio de roubar o poder mágico da viajante. ");
                        System.out.println(" - IRMÃO! POR FAVOR, PORQU-Ê...\n");
                        Thread.sleep(3000);
                        System.out.println(" Lumine adormece na esperança de reecontrar seu irmão...");
                        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("                                                      FIM                                                                  ");
                        // Final Alternativo - Ruim
                    }
                } 
                else if(viajantes.equals("Enfrentar a Deusa")){
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    Thread.sleep(3000);
                    System.out.println(" Lumine levantou sua espada, e inbuiu de magia de luz, e foi para cima da divindade desconhecida.");
                    System.out.println(" - Como você ousa... Sua maldita, EU SOU UMA DIVINDADE, UMA MERA MORTAL JAMAIS PODERIA ME MACHUCAR! - Disse a deusa desconhecida, irritada.");
                    System.out.println(" Lumine continua a atacar a deusa consecutivamente, uma luta entre espadas e magias seguiu continuando.");
                    System.out.println(" A viajante consegue ferir a deusa, que se mantém furiosa.");
                    System.out.println(" - Você me machucou, você vai ter o que merece! - gritou a Deusa.");
                    System.out.println(" Então a Deusa lançou uma magia, que sugou todas as memórias de Lumine, e logo em seguida, a lançou em um portal que levava para uma dimensão totalmente diferente da de Aether.");
                    System.out.println(" Você nunca mais vai se lembrar quem é você, seu irmão NUNCA VAI CONSEGUIR TE ENCONTRAR HAHAHAHAHA - gargalhou a deusa");
                    System.out.println(" A viajante cai numa dimensão, onde vivem pequenas fadas e elfos.\n ");
                    System.out.println(" Será que Aether conseguirá salvar sua irmã? Em que dimensão essa Floresta das Fadas fica? Veremos futuramente =)");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                      FIM                                                                  ");
                    gemeos.close();
                    // Final Alternativo - Bom
                }      
        }         
    }  
}
