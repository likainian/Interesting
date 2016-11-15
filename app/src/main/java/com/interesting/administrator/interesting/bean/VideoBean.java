package com.interesting.administrator.interesting.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 16/11/15.
 */

public class VideoBean {

    /**
     * code : 0
     * message : 成功
     * currentTime : 1479220112
     * data : {"cid":"6","pv_id":"{371633F5-AA5B-2684-5E9D-89102ED078A4}","count":10,"op":"2","page":1,"min_time":1479206491326,"max_time":1479212162436,"show_time":1479220102,"data":[{"id":"221604","source":"","source_name":"","source_id":"","title":"杨幂经典角色盘点，原来我家大幂幂身材这么上镜！ ","type":"6","read_count":"358","share_count":"0","comment_count":"2","url":"http://html.shehuitu.com/detail/2016/11/15/221604.html?content_id=221604&amp;key=1309ePaXO1gqlo2vIy63fRYMxSQ-cyL9n0uWtxhGDKI5HeihUx39IO4IJ62cQkI4BGkVBP3-G6zKLs0asic2cbvWhPOX43DtAyIMpWiVEI2YUJk_8oD3TsANmWfzh4zp&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":" ","tag":["杨幂","美人心计","明星"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ae746547d9.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479212162436","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220953","source":"","source_name":"","source_id":"","title":"娱乐圈比马蓉更坑老公的女星，你知道吗？","type":"6","read_count":"504","share_count":"0","comment_count":"2","url":"http://html.shehuitu.com/detail/2016/11/15/220953.html?content_id=220953&amp;key=b359QvAbcKhx0gphxJ1vSmmNHmdQpfOxq4piVxIYtaj4ehtb55HAiqqDTL_3eH_m2gXQMnjciW3GvhuPcn-WjWcwk0NFEJt8ICXbyWAsrCDAOJZmqNkZPT8G8ji0Vi1l&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"https://v.qq.com/iframe/player.html?vid=u0346qgdqdt&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["马蓉","白静","女星"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582aba6541a36.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479211262774","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"flag":1,"imageType":1,"times":1,"type":"ad","slotId":2789561,"cid":"6","op":"2","page":1,"index":2,"tips":"广告","appId":"e786964e","desc":"这是条广告"},{"id":"220801","source":"","source_name":"","source_id":"","title":"实拍10年前赵丽颖参加选秀视频，一开口我就沉默了","type":"6","read_count":"550","share_count":"0","comment_count":"9","url":"http://html.shehuitu.com/detail/2016/11/15/220801.html?content_id=220801&amp;key=99f7-E2q7CLf0Uw_t7P9TxKh2yRN8Uh8Mixo2nLaK4YKeLH4qFogWW0bQJsDq4mSSalI6eVoZ1zUcFqRpdQt57YZhwxQyTpj63iejMUuy7xQ8ea9RmiU1rdEnnfCi3UM&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"http://v.qq.com/iframe/player.html?vid=t0346lkorjw&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["赵丽颖","选秀","青涩"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ab11f3643e.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479211262617","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220984","source":"","source_name":"","source_id":"","title":"网传Selina离婚原因真相爆料，第三者就是亲妹妹","type":"6","read_count":"397","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/15/220984.html?content_id=220984&amp;key=1100yGgOF3B1dg3ZAGiLe60cUy0Lj_ZhA6BgdYaPTvP7DM7ASN6B4a-PUxepdmQ46bvsr2X5GxJ2iq2dQqHHs-x5UwEJtKpPZPzKi41sKxvz0UZXeVKHNKWwb7lkM_a-&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"https://v.qq.com/iframe/player.html?vid=a0346rijmlo&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["Selina","离婚","妹妹","女星","爆料"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582abbbb30e58.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479210662194","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"221602","source":"","source_name":"","source_id":"","title":"爆料！唐嫣和罗晋终于恋情曝光！又是一对奉子成婚！","type":"6","read_count":"711","share_count":"0","comment_count":"4","url":"http://html.shehuitu.com/detail/2016/11/15/221602.html?content_id=221602&amp;key=01adOHwXQKahZ99LxTBZ6IJWK_JCwf9HZsn7r7OORPjbhRuKYXWIc-_jukfgLnDW3hOh8m6ZbfFDG3sTwJBsQzZn0JddGCUA8kWiQlzcrY_B97tK5CNG3qhDdgeSl-fJ&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":" &lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"http://v.qq.com/iframe/player.html?vid=n0346g9uyel&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["唐嫣","罗晋","奉子成婚","爆料"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ae71bb051a.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479210063170","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220999","source":"","source_name":"","source_id":"","title":"62张照片帮你回顾成龙这62年的影视点滴！","type":"6","read_count":"280","share_count":"1","comment_count":"2","url":"http://html.shehuitu.com/detail/2016/11/15/220999.html?content_id=220999&amp;key=a1efG4sf2RGYCt9nqy7HdUymFVPi9MI8b9XAe0A9vNjpnRHSsF30ILV4jZXw9xGdlPWfDMVx-1qv8DSXTKUGaI6ErIuRvaXEhUACCAZY-2nz9v0BZH192Ck8WydA7_nk&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"http://v.qq.com/iframe/player.html?vid=c0346925puc&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["成龙","巨星","武打"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582abc66e664b.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479210062380","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220794","source":"","source_name":"","source_id":"","title":"她坐牢3年不影响人缘 儿子大婚刘嘉玲向华强都来了","type":"6","read_count":"529","share_count":"0","comment_count":"2","url":"http://html.shehuitu.com/detail/2016/11/15/220794.html?content_id=220794&amp;key=79a8h1QTIVO3zA552ArW2oq7ePQaPqJkf1mM6vYZj2uDFyP9E7o9nwFDMA7dbsAPS9sNyCaJoeOR75flOCMfxtTdcympwnkt5deSAf6O35lu_gmMEPvV2X3hXula0aBk&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"https://v.qq.com/iframe/player.html?vid=o034682c0q5&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["刘嘉玲","向华强","毛玉萍"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ab0c5d7c40.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479208261733","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220784","source":"","source_name":"","source_id":"","title":"还记得\u201c索腿天后\u201d吗？15岁当模特养家，如今嫁入豪门","type":"6","read_count":"370","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/15/220784.html?content_id=220784&amp;key=a861jyXj-KiHOgkxkwe3OSP0XRSv-8HJc9CTIYpJOhzLebXGMHGelSe9lD34wyPhBUkdwSzaQevUmVpHFkJ1-VDdhp0ztYUb9xOyZeGa8eK1NEuNlHb5vbHuHFQmadnE&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":" ","tag":["香港","陈敏之","模特"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ab05848d33.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479207661941","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"221599","source":"","source_name":"","source_id":"","title":"蔡依林被占卜变心甩锦荣 林志玲明年桃花最旺","type":"6","read_count":"193","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/15/221599.html?content_id=221599&amp;key=0123YNT497Ob0SXwNy4W96EFB9VeBKy3tYN8WWTVcVVc8kQV0BvtBsaLT2TZN-AiHAhtd1sGwNR-srC11iZte8z-29qXEI2HECdjlqf7PHbz8nTQrGycHf2cp06ky6fn&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"","tag":["蔡依林","锦荣","林志玲"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ae6e50b670.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479206630184","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"221589","source":"","source_name":"","source_id":"","title":"胡歌与众女神合照，贾静雯可爱，赵丽颖开心只有唐嫣哭了","type":"6","read_count":"445","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/15/221589.html?content_id=221589&amp;key=643f0H_2ica-0UENdQy7_JDb0wim9dFit7eaJkBzUVNBOg8JCJFLDGCQLUd_faxrLSpwa-khxMAWKyW6OEBPnahmIjWuwz7kiIszB6BYn-OYvT3rGWZ0Gkxx9scXTgcP&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":" ","tag":["胡歌","赵丽颖","唐嫣"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ae65a2d3da.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479206491326","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false}],"top":[]}
     */

    private int code;
    private String message;
    private int currentTime;
    /**
     * cid : 6
     * pv_id : {371633F5-AA5B-2684-5E9D-89102ED078A4}
     * count : 10
     * op : 2
     * page : 1
     * min_time : 1479206491326
     * max_time : 1479212162436
     * show_time : 1479220102
     * data : [{"id":"221604","source":"","source_name":"","source_id":"","title":"杨幂经典角色盘点，原来我家大幂幂身材这么上镜！ ","type":"6","read_count":"358","share_count":"0","comment_count":"2","url":"http://html.shehuitu.com/detail/2016/11/15/221604.html?content_id=221604&amp;key=1309ePaXO1gqlo2vIy63fRYMxSQ-cyL9n0uWtxhGDKI5HeihUx39IO4IJ62cQkI4BGkVBP3-G6zKLs0asic2cbvWhPOX43DtAyIMpWiVEI2YUJk_8oD3TsANmWfzh4zp&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":" ","tag":["杨幂","美人心计","明星"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ae746547d9.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479212162436","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220953","source":"","source_name":"","source_id":"","title":"娱乐圈比马蓉更坑老公的女星，你知道吗？","type":"6","read_count":"504","share_count":"0","comment_count":"2","url":"http://html.shehuitu.com/detail/2016/11/15/220953.html?content_id=220953&amp;key=b359QvAbcKhx0gphxJ1vSmmNHmdQpfOxq4piVxIYtaj4ehtb55HAiqqDTL_3eH_m2gXQMnjciW3GvhuPcn-WjWcwk0NFEJt8ICXbyWAsrCDAOJZmqNkZPT8G8ji0Vi1l&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"https://v.qq.com/iframe/player.html?vid=u0346qgdqdt&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["马蓉","白静","女星"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582aba6541a36.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479211262774","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"flag":1,"imageType":1,"times":1,"type":"ad","slotId":2789561,"cid":"6","op":"2","page":1,"index":2,"tips":"广告","appId":"e786964e","desc":"这是条广告"},{"id":"220801","source":"","source_name":"","source_id":"","title":"实拍10年前赵丽颖参加选秀视频，一开口我就沉默了","type":"6","read_count":"550","share_count":"0","comment_count":"9","url":"http://html.shehuitu.com/detail/2016/11/15/220801.html?content_id=220801&amp;key=99f7-E2q7CLf0Uw_t7P9TxKh2yRN8Uh8Mixo2nLaK4YKeLH4qFogWW0bQJsDq4mSSalI6eVoZ1zUcFqRpdQt57YZhwxQyTpj63iejMUuy7xQ8ea9RmiU1rdEnnfCi3UM&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"http://v.qq.com/iframe/player.html?vid=t0346lkorjw&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["赵丽颖","选秀","青涩"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ab11f3643e.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479211262617","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220984","source":"","source_name":"","source_id":"","title":"网传Selina离婚原因真相爆料，第三者就是亲妹妹","type":"6","read_count":"397","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/15/220984.html?content_id=220984&amp;key=1100yGgOF3B1dg3ZAGiLe60cUy0Lj_ZhA6BgdYaPTvP7DM7ASN6B4a-PUxepdmQ46bvsr2X5GxJ2iq2dQqHHs-x5UwEJtKpPZPzKi41sKxvz0UZXeVKHNKWwb7lkM_a-&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"https://v.qq.com/iframe/player.html?vid=a0346rijmlo&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["Selina","离婚","妹妹","女星","爆料"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582abbbb30e58.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479210662194","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"221602","source":"","source_name":"","source_id":"","title":"爆料！唐嫣和罗晋终于恋情曝光！又是一对奉子成婚！","type":"6","read_count":"711","share_count":"0","comment_count":"4","url":"http://html.shehuitu.com/detail/2016/11/15/221602.html?content_id=221602&amp;key=01adOHwXQKahZ99LxTBZ6IJWK_JCwf9HZsn7r7OORPjbhRuKYXWIc-_jukfgLnDW3hOh8m6ZbfFDG3sTwJBsQzZn0JddGCUA8kWiQlzcrY_B97tK5CNG3qhDdgeSl-fJ&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":" &lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"http://v.qq.com/iframe/player.html?vid=n0346g9uyel&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["唐嫣","罗晋","奉子成婚","爆料"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ae71bb051a.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479210063170","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220999","source":"","source_name":"","source_id":"","title":"62张照片帮你回顾成龙这62年的影视点滴！","type":"6","read_count":"280","share_count":"1","comment_count":"2","url":"http://html.shehuitu.com/detail/2016/11/15/220999.html?content_id=220999&amp;key=a1efG4sf2RGYCt9nqy7HdUymFVPi9MI8b9XAe0A9vNjpnRHSsF30ILV4jZXw9xGdlPWfDMVx-1qv8DSXTKUGaI6ErIuRvaXEhUACCAZY-2nz9v0BZH192Ck8WydA7_nk&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"http://v.qq.com/iframe/player.html?vid=c0346925puc&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["成龙","巨星","武打"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582abc66e664b.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479210062380","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220794","source":"","source_name":"","source_id":"","title":"她坐牢3年不影响人缘 儿子大婚刘嘉玲向华强都来了","type":"6","read_count":"529","share_count":"0","comment_count":"2","url":"http://html.shehuitu.com/detail/2016/11/15/220794.html?content_id=220794&amp;key=79a8h1QTIVO3zA552ArW2oq7ePQaPqJkf1mM6vYZj2uDFyP9E7o9nwFDMA7dbsAPS9sNyCaJoeOR75flOCMfxtTdcympwnkt5deSAf6O35lu_gmMEPvV2X3hXula0aBk&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"&lt;iframe frameborder=\"0\" width=\"640\" height=\"498\" src=\"https://v.qq.com/iframe/player.html?vid=o034682c0q5&amp;tiny=0&amp;auto=0\" allowfullscreen&gt;&lt;/iframe&gt;","tag":["刘嘉玲","向华强","毛玉萍"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ab0c5d7c40.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479208261733","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"220784","source":"","source_name":"","source_id":"","title":"还记得\u201c索腿天后\u201d吗？15岁当模特养家，如今嫁入豪门","type":"6","read_count":"370","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/15/220784.html?content_id=220784&amp;key=a861jyXj-KiHOgkxkwe3OSP0XRSv-8HJc9CTIYpJOhzLebXGMHGelSe9lD34wyPhBUkdwSzaQevUmVpHFkJ1-VDdhp0ztYUb9xOyZeGa8eK1NEuNlHb5vbHuHFQmadnE&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":" ","tag":["香港","陈敏之","模特"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ab05848d33.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479207661941","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"221599","source":"","source_name":"","source_id":"","title":"蔡依林被占卜变心甩锦荣 林志玲明年桃花最旺","type":"6","read_count":"193","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/15/221599.html?content_id=221599&amp;key=0123YNT497Ob0SXwNy4W96EFB9VeBKy3tYN8WWTVcVVc8kQV0BvtBsaLT2TZN-AiHAhtd1sGwNR-srC11iZte8z-29qXEI2HECdjlqf7PHbz8nTQrGycHf2cp06ky6fn&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":"","tag":["蔡依林","锦荣","林志玲"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ae6e50b670.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479206630184","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false},{"id":"221589","source":"","source_name":"","source_id":"","title":"胡歌与众女神合照，贾静雯可爱，赵丽颖开心只有唐嫣哭了","type":"6","read_count":"445","share_count":"0","comment_count":"0","url":"http://html.shehuitu.com/detail/2016/11/15/221589.html?content_id=221589&amp;key=643f0H_2ica-0UENdQy7_JDb0wim9dFit7eaJkBzUVNBOg8JCJFLDGCQLUd_faxrLSpwa-khxMAWKyW6OEBPnahmIjWuwz7kiIszB6BYn-OYvT3rGWZ0Gkxx9scXTgcP&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0","is_hot":"0","is_top":"0","introduction":" ","tag":["胡歌","赵丽颖","唐嫣"],"cover":["http://static.1sapp.com/image/sp/2016/11/15/582ae65a2d3da.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"],"cover_show_type":"4","share_type":"0","can_comment":"1","publish_time":"1479206491326","content_type":"3","unlike_enable":0,"show_comment":0,"tips":"视频","font_color":"","font_bold":0,"show_time":1479220102,"is_favorite":false}]
     * top : []
     */

    private WDataBean data;

    public static VideoBean objectFromData(String str) {

        return new Gson().fromJson(str, VideoBean.class);
    }

    public static VideoBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), VideoBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<VideoBean> arrayVideoBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<VideoBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<VideoBean> arrayVideoBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<VideoBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int currentTime) {
        this.currentTime = currentTime;
    }

    public WDataBean getData() {
        return data;
    }

    public void setData(WDataBean data) {
        this.data = data;
    }

    public static class WDataBean {
        private String cid;
        private String pv_id;
        private int count;
        private String op;
        private int page;
        private long min_time;
        private long max_time;
        private int show_time;
        /**
         * id : 221604
         * source :
         * source_name :
         * source_id :
         * title : 杨幂经典角色盘点，原来我家大幂幂身材这么上镜！
         * type : 6
         * read_count : 358
         * share_count : 0
         * comment_count : 2
         * url : http://html.shehuitu.com/detail/2016/11/15/221604.html?content_id=221604&amp;key=1309ePaXO1gqlo2vIy63fRYMxSQ-cyL9n0uWtxhGDKI5HeihUx39IO4IJ62cQkI4BGkVBP3-G6zKLs0asic2cbvWhPOX43DtAyIMpWiVEI2YUJk_8oD3TsANmWfzh4zp&amp;pv_id=%7B371633F5-AA5B-2684-5E9D-89102ED078A4%7D&amp;cid=6&amp;cat=6&amp;rss_source=&amp;fr=1&amp;o=2&amp;p=1&amp;skip_ad=0
         * is_hot : 0
         * is_top : 0
         * introduction :
         * tag : ["杨幂","美人心计","明星"]
         * cover : ["http://static.1sapp.com/image/sp/2016/11/15/582ae746547d9.png?imageView2/2/w/1000/h/600/q/70/format/jpeg"]
         * cover_show_type : 4
         * share_type : 0
         * can_comment : 1
         * publish_time : 1479212162436
         * content_type : 3
         * unlike_enable : 0
         * show_comment : 0
         * tips : 视频
         * font_color :
         * font_bold : 0
         * show_time : 1479220102
         * is_favorite : false
         */

        private List<DataBean> data;
        private List<?> top;

        public static WDataBean objectFromData(String str) {

            return new Gson().fromJson(str, WDataBean.class);
        }

        public static WDataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), WDataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<WDataBean> arrayWDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<WDataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<WDataBean> arrayWDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<WDataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getPv_id() {
            return pv_id;
        }

        public void setPv_id(String pv_id) {
            this.pv_id = pv_id;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getOp() {
            return op;
        }

        public void setOp(String op) {
            this.op = op;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public long getMin_time() {
            return min_time;
        }

        public void setMin_time(long min_time) {
            this.min_time = min_time;
        }

        public long getMax_time() {
            return max_time;
        }

        public void setMax_time(long max_time) {
            this.max_time = max_time;
        }

        public int getShow_time() {
            return show_time;
        }

        public void setShow_time(int show_time) {
            this.show_time = show_time;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public List<?> getTop() {
            return top;
        }

        public void setTop(List<?> top) {
            this.top = top;
        }

        public static class DataBean {
            private String id;
            private String source;
            private String source_name;
            private String source_id;
            private String title;
            private String type;
            private String read_count;
            private String share_count;
            private String comment_count;
            private String url;
            private String is_hot;
            private String is_top;
            private String introduction;
            private String cover_show_type;
            private String share_type;
            private String can_comment;
            private String publish_time;
            private String content_type;
            private int unlike_enable;
            private int show_comment;
            private String tips;
            private String font_color;
            private int font_bold;
            private int show_time;
            private boolean is_favorite;
            private List<String> tag;
            private List<String> cover;

            public static DataBean objectFromData(String str) {

                return new Gson().fromJson(str, DataBean.class);
            }

            public static DataBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<DataBean> arrayDataBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<DataBean> arrayDataBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<DataBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getSource_name() {
                return source_name;
            }

            public void setSource_name(String source_name) {
                this.source_name = source_name;
            }

            public String getSource_id() {
                return source_id;
            }

            public void setSource_id(String source_id) {
                this.source_id = source_id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRead_count() {
                return read_count;
            }

            public void setRead_count(String read_count) {
                this.read_count = read_count;
            }

            public String getShare_count() {
                return share_count;
            }

            public void setShare_count(String share_count) {
                this.share_count = share_count;
            }

            public String getComment_count() {
                return comment_count;
            }

            public void setComment_count(String comment_count) {
                this.comment_count = comment_count;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getIs_hot() {
                return is_hot;
            }

            public void setIs_hot(String is_hot) {
                this.is_hot = is_hot;
            }

            public String getIs_top() {
                return is_top;
            }

            public void setIs_top(String is_top) {
                this.is_top = is_top;
            }

            public String getIntroduction() {
                return introduction;
            }

            public void setIntroduction(String introduction) {
                this.introduction = introduction;
            }

            public String getCover_show_type() {
                return cover_show_type;
            }

            public void setCover_show_type(String cover_show_type) {
                this.cover_show_type = cover_show_type;
            }

            public String getShare_type() {
                return share_type;
            }

            public void setShare_type(String share_type) {
                this.share_type = share_type;
            }

            public String getCan_comment() {
                return can_comment;
            }

            public void setCan_comment(String can_comment) {
                this.can_comment = can_comment;
            }

            public String getPublish_time() {
                return publish_time;
            }

            public void setPublish_time(String publish_time) {
                this.publish_time = publish_time;
            }

            public String getContent_type() {
                return content_type;
            }

            public void setContent_type(String content_type) {
                this.content_type = content_type;
            }

            public int getUnlike_enable() {
                return unlike_enable;
            }

            public void setUnlike_enable(int unlike_enable) {
                this.unlike_enable = unlike_enable;
            }

            public int getShow_comment() {
                return show_comment;
            }

            public void setShow_comment(int show_comment) {
                this.show_comment = show_comment;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }

            public String getFont_color() {
                return font_color;
            }

            public void setFont_color(String font_color) {
                this.font_color = font_color;
            }

            public int getFont_bold() {
                return font_bold;
            }

            public void setFont_bold(int font_bold) {
                this.font_bold = font_bold;
            }

            public int getShow_time() {
                return show_time;
            }

            public void setShow_time(int show_time) {
                this.show_time = show_time;
            }

            public boolean isIs_favorite() {
                return is_favorite;
            }

            public void setIs_favorite(boolean is_favorite) {
                this.is_favorite = is_favorite;
            }

            public List<String> getTag() {
                return tag;
            }

            public void setTag(List<String> tag) {
                this.tag = tag;
            }

            public List<String> getCover() {
                return cover;
            }

            public void setCover(List<String> cover) {
                this.cover = cover;
            }
        }
    }
}
