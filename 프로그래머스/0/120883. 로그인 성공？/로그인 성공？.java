class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean foundID = false;
        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0])) { //먼저 아이디부터 확인하고
                foundID = true;  // 아이디가 일치하는 것이 있었기에 먼저 flag를 세운다
                answer = "wrong pw";
                if (db[i][1].equals(id_pw[1])) { //아이디가 일치하면 비밀번호를 확인한다
                    answer = "login";
                    break;
                }
            } else {
                if (foundID) { //이미 아이디가 일치하는 것이 db에 있었다면 flag가 있었을 테니, 그 flag를 먼저 확인한다. 
                    answer = "wrong pw";
                } else {
                    answer = "fail";
                }
            }
        }
        return answer;
    }
}