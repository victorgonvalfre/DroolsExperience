[condition][]Validar notificacao =$n : Notificacao($o: Obito)
[condition][]Verifica se Doacao foi negada =$d: Doacao($o2: Obito,  autorizado == false)
[condition][]Confirma relacao de Notificacao e Obito = $o3: Obito(this == $o, $o3 == $o2)

[consequence][]Display msgDoacaoNegada= System.out.println("---> Doação Negada! "+ $d.getMotivoRecusa());
[consequence][]Deleta Doacao = retract($d)
[consequence][]Deleta Notificacao = retract($n) 