1. A deck of cards, something to keep track of score

2. 

[0] Shuffle the cards randomly
[2] Deal 9 cards face up. 
[3] Let the player choose two cards and decide if they add up to Eleven. 
[4] If they don't add up, do nothing. 
[5] If they do, take the two cards away and deal new cards in their place. 
[6] Have a special exception if they chose a K, Q, and J, if they don't add up to 11 and take away all three if they are chosen.
[7] Repeat 3-6 until there are no possible options or all of the cards have been dealt.

3. No, it does not contain the methods that deal with deciding if the cards selected equal 11 or JQK, and if a move is possible after the cards are redealt.

4. 
	a. DealMyCards is called when creating the class first and when making a new game.
	b. isLegal, anotherPlayIsPossible
	c. 0: J, 1: 6, 2: 2, 3: A, 4: 4
	d.

	for (Integer I : cIndexes {
		System.print.ln(cIndexes.get(I));
	}

	e. anotherPlayIsPossible, needs to know if enough cards are left before deiciding if it contains a legal combination.

