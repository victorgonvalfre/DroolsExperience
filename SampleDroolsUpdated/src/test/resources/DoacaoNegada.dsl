[condition][]Verificar notificacao ativa =$n : Notificacao($o: Obito)
[condition][]e se Doacao foi negada =$d: Doacao($o2: Obito,  autorizado == false)

[consequence][]Display mensagem de recusa de doacao= System.out.println("---> Doação Negada! "+ $d.getMotivoRecusa());
[consequence][]Retira a Doacao = retract($d)
[consequence][]e a Notificacao do processo = retract($n) 