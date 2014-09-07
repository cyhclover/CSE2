//Yuhua Chen
//hw02
//CSE2
//Lab section: Wed

//This program manipulaties data stored in variables
//It will run simple calculations, and print the numerical output that just generated.


public class Arithmetic{
// main method for this Arithmetic
public static void main(String[] args) {
    //User inputs 
    //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;
    
    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
        
    double totalSockCost$,   //total cost of socks 
    totalSockTax$,  //total sales tax for sock
    totalGlassCost$, //total cost of glass
    totalGlassTax$, //total sales tax for glass
    totalEnvelopeCost$, //total cost of envelopes
    totalEnvelopeTax$, //total sales tax for envelope
    totalBeforeTax$,//Total cost of purchases (before tax)
    total$; //Total actually paid for this transaction, including sales tax

    //calculations 
    totalSockCost$ = nSocks*sockCost$;
    totalSockTax$ = totalSockCost$*taxPercent;
    totalGlassCost$=nGlasses*glassCost$;
    totalGlassTax$=totalGlassCost$*taxPercent;
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
    totalEnvelopeTax$=totalEnvelopeCost$*taxPercent;
    
    totalBeforeTax$ = totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
    total$ = totalBeforeTax$ + totalSockTax$ + totalGlassTax$ +totalEnvelopeTax$;
    
    //print out results
    System.out.printf("Total cost for sock is:            $  %1$.2f\n", totalSockCost$ );
    System.out.printf("Total sales tax for sock is:       $  %1$.2f\n", totalSockTax$ );
    System.out.printf("Total cost for glasses is:         $ %1$.2f\n", totalGlassCost$ );
    System.out.printf("Total sales tax for glasses is:    $  %1$.2f\n", totalGlassTax$ );
    System.out.printf("Total cost for envelope is:        $  %1$.2f\n", totalEnvelopeCost$ );
    System.out.printf("Total sales tax for envelope is:   $  %1$.2f\n", totalEnvelopeTax$ );
    System.out.printf("Total cost of purchase(no tax) is: $ %1$.2f\n", totalBeforeTax$ );
    System.out.printf("Total cost of this transaction is: $ %1$.2f\n", total$ );
    
}
}