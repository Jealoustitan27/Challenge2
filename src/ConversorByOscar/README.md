<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Other/html.html to edit this template
-->

<head>
 <title>Programa Conversor</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Estilo.js"/>
    <link rel="stylesheet" href="style.css" type="text/css">


</head >


<header class="color2">
    <h1 Class="titulos"><<font color="#800080" >Este es un programa elaborado por Oscar Alexis Pérez Galván</font></h1>
</header>





<body class="color">
    
</body>

<main class="prin" >
     <div class="intro">
        <p><strong>Introducción</strong></p>
        <p>Este programa se desarrollo por medio de la interfaz grafica de NetBeans donde se utilizaron diferentes metodos como son el metodo Case. <br>
            Donde se utilizo un ComboBox para poder seleccionar el tipo de moneda que se requeria asi como los distintos tipos de temperatura y donde se puede <br>
            colocar el dato y de manera inmediata se mandara un resultado sobre la opcion elegida anteriormente, Descargar proyecto completo para su uso</p>
    </div>
    <div class="explicacion">
        <p><strong>Desarrollo</strong></p>
        <p>El programa consiste en obtener la informacion de un textfield donde es por medio de un GetText el cual se almacena en una variable de tipo String la cual <br> 
            despues sera tranformada en un valor de tipo double para poder utilizar numeros el cual es con un Double.ParseDouble y se le concatena la variable correspondiente<br> 
            para poder hacer las operaciones correspondientes y poder depositarlo en el otro TextField el cual sera para el resultado<br> 
            Ahora, todo este procedmiento esta almacenado en un Try Catch y un metodo Case en el cual el Try Catch solo funciona para poder evitar errores por parte del usuario<br> 
            El metodo Case es utilizado para poder obtener el indice seleccionado del ComboBox por medio de ua variable de tipo entero y la instruccion GetSelectedIndex <br>
            La cual nos da el numero de indice que corresponde a las opciones que colocamos las cuales comienzan desde 0 y continuan hasta la que coloquemos en nuestro ComboBox <br>
        Apartir de esto solo es hacer Case depende las opciones y las operaciones correspondientes</p>
    </div>
</main>

