class Game(val map: List[String]) {
	
	if(map.length != 9) {
		throw new IllegalArgumentException("You must pass a list with nine elements.")
	}

	map.foreach { cell =>
		if(cell != "X" && cell != "O" && cell != ".") {
			throw new IllegalArgumentException("All values in the list must be 'X', 'O', or '.'")
		}
	}

	val winners = List(
		// Horizontal
		List(0, 1, 2),
		List(3, 4, 5),
		List(6, 7, 8),
		// Diagonal
		List(0, 4, 8),
		List(2, 5, 6),
		// Vertical
		List(0, 3, 6),
		List(1, 4, 7),
		List(2, 5, 8)
	)

	def checkFreeCells():Boolean = {
		map.foreach { cell =>
			if(cell == ".") {
				return true
			}
		}
		return false
	}

	def printBoard() {
		println(map.slice(0, 3))
		println(map.slice(3, 6))
		println(map.slice(6, 9))
	}

	def getWinner() {
		if(checkFreeCells) {
			println("There are free cells, this game is not finished!")
			return
		}
		winners foreach { winner =>
			if (map(winner(0)) == map(winner(1)) && map(winner(1)) == map(winner(2))) {
				println("Oy! We have a winner: " + map(winner(0)))
				println("Winner in cells:")
				println(winner)
				printBoard
				return true
			}
		}
		println("It appears that this game has no winner.")
		printBoard
	}

}

val game = new Game(List("O", "O", "O", "O", "X", "O", "X", "O", "X"))
game.getWinner
