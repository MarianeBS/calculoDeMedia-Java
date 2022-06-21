package padrao;

//Importações de pacotes correspondentes à interface de JFrame:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Importação de pacote correspondente à forma decimal
import java.text.DecimalFormat;
/**
 *
 * @author Mariane
 */
//Classe Média que herda os atributos e métodos da classe JFrame 
public class Media extends JFrame 
{
    //Criando rótulos de texto:
    JLabel titulo, label1, label2, label3, label4, exibir;
    //Criando campos onde o usuário irá informar os dados de entrada
    JTextField n1, n2, n3, n4;
    //Criando os botôes que quando apertados farão cálculo ou limpeza:
    JButton calcular, limpar;
    //Variável para formatar numeros em formato decimal
    public DecimalFormat df = new DecimalFormat ("0.00");
    
    //Método construtor:
    public Media()
    {
        //Título da parte superior da telinha:
        super("Média de aluno");
        //Criando o objeto tela:
        Container tela = getContentPane();
        //Posicionamento dos rótulos na telinha(isso fará com que eles dependam do posicionamento feito no setBounds):
        setLayout(null);
        //Instãncia do título e o que ele deverá apresentar ao ser chamado:
        titulo = new JLabel ("Cálculo de Média");
        //Instãncia do label1 e o que ele deverá apresentar ao ser chamado:
        label1 = new JLabel ("1ª nota:");
        //Instãncia do label2 e o que ele deverá apresentar ao ser chamado:
        label2 = new JLabel ("2ª nota:");
        //Instãncia do label3 e o que ele deverá apresentar ao ser chamado:
        label3 = new JLabel ("3ª nota:");
        //Instãncia do label4 e o que ele deverá apresentar ao ser chamado:
        label4 = new JLabel ("4ª nota:");
        //Instãncia do exibir e o que ele deverá apresentar ao ser chamado 
        //(não está constando o que será exibido pois isto será atribuido algumas linhas abaixo):
        exibir = new JLabel ("");
        //Instãncia do n1 e a quantidade de colunas do componente (irá apresentar cinco colunas como tamanho):
        n1 = new JTextField (5);
        //Instãncia do n2 e a quantidade de colunas do componente:
        n2 = new JTextField (5);
        //Instãncia do n3 e a quantidade de colunas do componente:
        n3 = new JTextField (5);
        //Instãncia do n4 e a quantidade de colunas do componente:
        n4 = new JTextField (5);
        //Intãncia do botão calcular e o que ele terá escrito como seu rótulo: 
        calcular = new JButton ("Calcular");
        //Intãncia do limpar calcular e o que ele terá escrito como seu rótulo: 
        limpar = new JButton ("Limpar");
        
        //Posicionamento do título na janelinha:
        titulo.setBounds (150, 20, 150, 20);
        
        //Posicionamento do 1º rótulo na janelinha:
        label1.setBounds (85, 60, 100, 20);
        //Posicionamento do 1º campo de inserção de dados na janelinha:
        n1.setBounds (145, 60, 100, 20);
        
        //Posicionamento do 2º rótulo na janelinha:
        label2.setBounds (85, 100, 100, 20);
        //Posicionamento do 2º campo de inserção de dados na janelinha:
        n2.setBounds (145, 100, 100, 20);
        
        //Posicionamento do 3º rótulo na janelinha:
        label3.setBounds (85, 140, 100, 20);
        //Posicionamento do 3º campo de inserção de dados na janelinha:
        n3.setBounds (145, 140, 100, 20);
        
        //Posicionamento do 4º rótulo na janelinha:
        label4.setBounds (85, 180, 100, 20);
        //Posicionamento do 4º campo de inserção de dados na janelinha:
        n4.setBounds (145, 180, 100, 20);
        
        //Posicionamento do botão de cálculo na janelinha:
        calcular.setBounds (100, 230, 100, 25);
        //Posicionamento do botão de limpar na janelinha:
        limpar.setBounds (200, 230, 100, 25);
        
        //Posicionamento do label de exibição do resultado na janelinha:
        exibir.setBounds (50, 270, 200, 20);
        
        //Definindo a cor do título
        titulo.setForeground(Color.white);
        //Definindo a fonte e tamanho do título
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        
        
        //Atribuição de funcionalidade ao botão Calcular
        calcular.addActionListener
        (
            new ActionListener()
            {
                //Método utilizado para ouvir ações realizadas no botão Calcular (ação: clicar)
                public void actionPerformed(ActionEvent e)
                {
                    //Atribuindo variáveis locais para o cálculo da média:
                    double media, nota1, nota2, nota3, nota4;
                    //Atribuindo valor inicial para a variável media:  
                    media = 0.00;
                    //Convertendo para números decimais o que foi inserido em n1 no formato de String e o colocando em nota1 após a conversão:
                    nota1 = Double.parseDouble(n1.getText());
                    //Convertendo para números decimais o que foi inserido em n2 no formato de String e o colocando em nota1 após a conversão:
                    nota2 = Double.parseDouble(n2.getText());
                    //Convertendo para números decimais o que foi inserido em n3 no formato de String e o colocando em nota1 após a conversão:
                    nota3 = Double.parseDouble(n3.getText());
                    //Convertendo para números decimais o que foi inserido em n4 no formato de String e o colocando em nota1 após a conversão:
                    nota4 = Double.parseDouble(n4.getText());
                    //Atribuindo novo valor à media...
                    //Este valor será dado a partir do cálculo das quatro médias dividido por 4:
                    media = (nota1 + nota2 + nota3 + nota4)/4; 
                    //Atribuindo ao setVisible, true (verdadeiro), para que apresente o que será ordenado na próxima linha:
                    exibir.setVisible(true);
                    //Atribuindo o texto que deverá ser apresentado na tela (a exibição do resultado): 
                    exibir.setText("A média deste aluno é: " +df.format(media));
                } 
            }
        );
        
        //Atribuição de funcionalidade ao botão Limpar
        limpar.addActionListener
        (
            new ActionListener()
            {
                //Método utilizado para ouvir ações realizadas no botão Limpar (ação: clicar)
                public void actionPerformed(ActionEvent e)
                {
                    //Atribuindo null ao campo n1 para que volte a ficar em branco:
                    n1.setText(null);
                    //Atribuindo null ao campo n2 para que volte a ficar em branco:
                    n2.setText(null);
                    //Atribuindo null ao campo n3 para que volte a ficar em branco:
                    n3.setText(null);
                    //Atribuindo null ao campo n4 para que volte a ficar em branco:
                    n4.setText(null);
                    //Atribuindo null ao label de exibição para que apague o resultado apresentado anteriormente:
                    exibir.setText(null);
                    //Atribuindo o foco do ponteiro ao campo n1, para que, quando tudo for limpo, ele esteja no primeiro
                    //campo outra vez 
                    n1.requestFocus();  
                } 
            }
        );
        
        //Atribuindo ao setVisible, false (falso), para que não apresente o campo vazio declarado lá em cima:
        //Um setVisible(true) foi adicionado dentro da atribuição de funcionalidades do botão Calcular
        //Este exibir, diferente daquele que está dentro da funcionalidade do botão, está vazio; sem nada a exibir, 
        //por isso, coloca-se falso:
        exibir.setVisible(false);
        
        //Adicionando o título à janelinha do programa:
        tela.add(titulo);
        
        //Adicionando o 1º rótulo à tela de interface do programa:
        tela.add(label1);
        //Adicionando o 1º campo de inserção de dados à tela de interface do programa:
        tela.add(n1);
        
        //Adicionando o 2ºrótulo à tela de interface do programa:
        tela.add(label2);
        //Aicionando o 2º campo de inserção de dados à tela de interface do programa:
        tela.add(n2);
        
        //Adicionando o 3ºrótulo à tela de interface do programa:
        tela.add(label3);
        //Adicionando o 3º campo de inserção de dados à tela de interface do programa:
        tela.add(n3);
        
        //Adicionando o 4ºrótulo à tela de interface do programa:
        tela.add(label4);
        //Adicionando o 4º campo de inserção de dados à tela de interface do programa:
        tela.add(n4);
        
        //Adicionando o botão de realização de cálculo à tela de interface do programa:
        tela.add(calcular);
        //Adicionando o limpeza de realização de cálculo à tela de interface do programa:
        tela.add(limpar);
        //Adicionando o label de exibição de resultado à tela de interface do programa:
        tela.add(exibir);
        
        //Atribuindo cor à tela:
        tela.setBackground(Color.gray);
        //Atribuindo null ao modo relativo para que a telinha apareça no centro da tela do computador:
        setLocationRelativeTo(null);
        //Atribuindo false ao Resizable para que não seja possível redimencionar a telinha(aumentar ou diminuir):
        setResizable(false);
        //Atribuindo tamanhos à telinha (x,y):
        setSize(400, 350);
        //Atribuindo visibilidade à telinha com true:
        setVisible(true);
    }        
}
