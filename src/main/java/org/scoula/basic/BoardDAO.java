package org.scoula.basic;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

    // db에서 board 테이블의 모든 row를 가져왔다고 가정함.
    public List<BoardVO> getList(){
        List<BoardVO> list = new ArrayList<BoardVO>();
        for (int i = 0; i < 100; i++) {
            BoardVO vo = new BoardVO(i,
                    "title" + i,
                    "content" + i,
                    "writer" + i);
            list.add(vo);
        }
        return list;
    }
}



