Dim List_OfResults As New List(Of Integer) 'List you will read later to print all results
'Main variables (aka the ones you got on print)
Dim value1 As Integer = 0 'n1
Dim value2 As Integer = 0 'n2
Dim NumVeces As Integer = 0 'N (number of loop times?)

'extra cooking, you might not need these
Dim resultTest As Integer = 0 'extra variable
Dim putoRestodeMierda As Integer = 0 'extra variable, keeps adding value1 

'here you do your typing shit yada yada

'-- LOOP 1 --
'Goes through N number of times that it needs to execute the For Each
Do While resultTest <= NumVeces
    Dim numVeces_Pasado As Integer = 0 'NEW VARIABLE YEAH, it's for my loop so you might not need
    
    putoRestodeMierda = value1 'Equals the value you will pass later to n1 (and then add later odd numbers)
    
    Do While numVeces_Pasado <= value2 
        'basically go through the N number of times you need to get a new prime number
        value1 += 1
        
        'If it's divisible by 2, add 1 so it's odd
        If (value1 Mod 2) = 0 Then value1 += 1
            
        putoRestodeMierda += value1 'Starts adding odd numbers
    Loop
    
    'Once you have the total of n1 + N odd numbers,
    'add it to your list that you will read later
    List_OfResults.Add(putoRestodeMierda)    
    resultTest += 1 '+1 to the loop    
Loop

'Loading the results from all the operations
For Each Result_Print In List_OfResults
    Console.Writeline(Result_Print) 'Prints the result in your case in the cmd shit
Next