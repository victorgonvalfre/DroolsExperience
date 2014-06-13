[condition][]Verificar notificacao ativa =$n : ProcessoNotificacao($o: Obito, arquivado == false)
[condition][]com paciente apto para doacao = $o1: Obito(this == $o, aptoDoacao == true)
[condition][]e se a doacao não foi autorizada =$d: Doacao(obito == $o, autorizado == false)

[consequence][]Display mensagem de recusa de doacao= System.out.println("---> Doação Negada! ");
[consequence][]Retira a Doacao = retract($d)
[consequence][]e a Notificacao do processo = retract($n) 