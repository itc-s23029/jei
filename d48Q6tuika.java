/*
//s23029
//このプログラムは、ラグビーの試合結果から2チームの勝ち点を計算し、表示するプログラムである。なお、試合結果はコマンドラインから指定されるものとする。
class d48Q6kadia {
		public static void main(String[] args) {
				if (args.length != 4) { //(33) エ: コマンドラインから与えられたargsの個数が4じゃない場合以下のメッセージ
						System.out.println("数値を四つ指定してください");
						return;
				}

				Achievement teamA = new Achievement();
				teamA.set(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
				Achievement teamB = new Achievement();
				teamB.set(Integer.parseInt(args[2]), Integer.parseInt(args[3]));

				Match match = new Match();
				match.setAchievements(teamA, teamB); //(34) ウ: setAchievementsメッソドをte
				System.out.println(match.showResult());
		}
}

class Match {
		Achievement teamA;
		Achievement teamB;

	void setAchievements(Achievement a, Achievement b) {
			teamA = a;
			teamB = b;
	}

	String showResult() {
			return
			"Team A:" + winPoint(teamA.point, teamB.point, teamA.tryNumber)
		+ ",  Team B:" + winPoint(teamB.point, teamA.point, teamB.tryNumber);
	}
	String showResult() {
         return "TeamA:" + winPoint(teamA.point, teamB.point, teamA.tryNumber) + ", TeamB:"
                 + winPoint(teamB.point, teamA.point, teamB.tryNumber);
 }

     String winResult() {
         int temaAPoint = winPoint(teamA.point, teamB.point, teamA.tryNumber);
         int teamBPoint = winPoint(teamB.point, teamA.point, teamB.tryNumber);

         if (teamAPoint > teamBPoint) {
                 return "チームAの勝利";
         } else if (teamAPoint < teamBPoint) {
                 return "チームBの勝利";
         } else {
                 return "引き分け";
         }
 }

 int winPoint(int teamXPoint, int teamYPoint, int teamXTryNumber) {
         return matchPoint(teamXPoint, teamYPoint) + bounsPoint(teamXTryNumber);
 }


	int winPoint(int teamXPoint, int teamYPoint, int teamXTryNumber) {
			return matchPoint(teamXPoint, teamYPoint) + bonusPoint(teamXTryNumber); //(35) ウ: マッチポイントとボーナスポイントの合計
	}
	
	int matchPoint(int teamXPoint, int teamYPoint) {
			if (teamXPoint == teamYPoint) {
					return 2;
			} else if (teamXPoint > teamYPoint) {
					return 4;
			} else if (teamXPoint - teamYPoint <= 7) { //(36) ア: 得点差が7点以内の場合は1点
					return 1;
			}
			return 0;
	}

	int bonusPoint(int tryNumber) {
			return tryNumber >= 4 ? 1 : 0; //(37) エ: 3項演算子を使って4以上の場合1、偽の場合0を返している
	}
}

class Achievement {
		int point;
		int tryNumber;

		void set(int teamPoint, int teamTryNumber) {
				point = teamPoint;
				tryNumber = teamTryNumber;
		}
}

	String showResult() {
		return "TeamA:" + winPoint(teamA.point, teamB.point, teamA.tryNumber) + ", TeamB:"
				+ winPoint(teamB.point, teamA.point, teamB.tryNumber);
}

	String winResult() {
		int temaAPoint = winPoint(teamA.point, teamB.point, teamA.tryNumber);
		int teamBPoint = winPoint(teamB.point, teamA.point, teamB.tryNumber);
		
		if (teamAPoint > teamBPoint) {
				return "チームAの勝利";
		} else if (teamAPoint < teamBPoint) {
				return "チームBの勝利";
		} else {
				return "引き分け";
		}
}

int winPoint(int teamXPoint, int teamYPoint, int teamXTryNumber) {
		return matchPoint(teamXPoint, teamYPoint) + bounsPoint(teamXTryNumber);
}
*/
