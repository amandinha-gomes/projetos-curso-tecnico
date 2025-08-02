let darkmode = document.querySelector('#darkmode'); /*O ESQUEMA DE BUSCA PARA FAZER O MODO ESCURO/CLARO*/ /*LET DECLARA VARIAVEL*/

darkmode.onclick /*AÇÃO PARA O CLICK*/ = ()=>{ /*PROCESSOR PARA CLIQUE DO ICONE*/
    //alert("CLICOU");

    if(darkmode.classList.contains('bx-moon')){
        //alert("MODO ESCURO ATIVO");
        darkmode.classList.replace('bx-moon','bx-sun');
        document.body.classList.add('color');
    }else{
        darkmode.classList.replace('bx-sun','bx-moon');
        document.body.classList.remove('color');
    }
}
