O código que desenvolvi é um programa em Java que realiza várias operações envolvendo a coleta, armazenamento e leitura de informações sobre produtos. Vou explicar o que cada parte do código faz.

Primeiramente, o programa solicita ao usuário o caminho de um arquivo onde os dados serão salvos. Em seguida, ele cria uma lista para armazenar os produtos. Depois, pergunta ao usuário quantos produtos ele deseja adicionar. Para cada produto, o programa coleta o nome, preço e quantidade, criando um objeto de produto com essas informações e adicionando-o à lista.

Após coletar todos os dados dos produtos, o programa salva essas informações em um arquivo. Ele utiliza um BufferedWriter para escrever os dados, garantindo que cada produto seja escrito em uma nova linha do arquivo. As informações de cada produto são separadas por vírgulas para facilitar a leitura posterior.

Depois de salvar os dados, o programa abre o arquivo novamente, desta vez para leitura. Usando um BufferedReader, ele lê o conteúdo do arquivo linha por linha e exibe cada linha no console. Isso permite ao usuário verificar as informações que foram salvas.

Para a estrutura dos produtos, criei uma classe abstrata que define as propriedades básicas de um produto, como nome, preço e quantidade, além de um método abstrato para calcular o total (preço multiplicado pela quantidade). Também desenvolvi uma classe concreta que herda da classe abstrata e implementa o método para calcular o total.

Em resumo, o programa coleta dados sobre produtos, armazena esses dados em um arquivo e depois lê e exibe o conteúdo do arquivo, proporcionando uma maneira organizada de gerenciar informações de produtos

-----------------------------------------------------------------------------------------------------------------------------------------------------------------
The code I developed is a Java program that performs several operations involving collecting, storing and reading information about products. I will explain what each part of the code does.

First, the program asks the user for the path to a file where the data will be saved. It then creates a list to store the products. It then asks the user how many products they want to add. For each product, the program collects the name, price, and quantity, creating a product object with this information and adding it to the list.

After collecting all product data, the program saves this information in a file. It uses a BufferedWriter to write the data, ensuring that each product is written to a new line in the file. The information for each product is separated by commas to facilitate later reading.

After saving the data, the program opens the file again, this time for reading. Using a BufferedReader, it reads the file contents line by line and displays each line in the console. This allows the user to check the information that has been saved.

For the product structure, I created an abstract class that defines the basic properties of a product, such as name, price and quantity, as well as an abstract method to calculate the total (price multiplied by quantity). I also developed a concrete class that inherits from the abstract class and implements the method to calculate the total.

In short, the program collects data about products, stores this data in a file, and then reads and displays the contents of the file, providing an organized way to manage product information
