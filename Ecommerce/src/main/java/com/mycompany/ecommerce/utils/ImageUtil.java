package com.mycompany.ecommerce.utils;

import java.io.Serializable;
import java.util.Base64;

/**
 *
 * @author Eduar
 */
public class ImageUtil implements Serializable {

    public static String getBase64NoPhoto() {
        return "iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbS"
                + "JIAAAAY1BMVEX///9oaGhjY2NeXl5hYWFaWlrOzs5fX19YWFienp55eXnk5OT"
                + "7+/uDg4OTk5P19fWfn5+/v7/q6urU1NSNjY23t7fIyMjc3NympqZra2uvr6+Q"
                + "kJCGhoa5ublzc3PZ2dlQUFC1P+9nAAAOHklEQVR4nO1d6dKquhLdZhBBBhVRn"
                + "M/7P+UFP9EkpJMOhOitYlWdP2f7QRbp9JRO59+/GTNmzJgxY8aMGTNmzJgxY4"
                + "YnpLvH4XbexJfrNcuy6z6P62q7PO6+PS4f2JVVnESc0ogxIoIxSjlfXOvtsfj"
                + "2IIcifZyvDTdGFgY0VClf5Lfjt0frjOM5s5ETeTY0r9X624PGYxkzPLsPS07i"
                + "8ttDx6DMOXVl92ZJef7jJHc1G0yvI8nq3xXXZcLH0XuR5Mnh21R0SCsycvoEU"
                + "HZOv01IQVFz5oveE4zXv2QnG37epu8Nstr8DMfzBPz+ONY/IavbyCqfhEWNi8"
                + "bJ6Z60uDcyyHnjyFk/DKO3b9P7d7xTM7eGWhJXh+NOno6iccbPedIQJUae0em"
                + "7BjLNV2Z213NpjiB2S5t/x/dfXI4H2D407kmG9jTXt6vBESJ8OykLGMUVElBC"
                + "o7h0VBJlDLtDNPvKNIITGA11Lh8xBZ5J+Be8nJwDYxnlch0ywPLwi7eR47A7a"
                + "QdCVvlYt3m30XtHZBE06XHQqlBPnlZ6ZlqOq4CSutFJKKP+vOVKy5HHvp5vQx"
                + "bp5NOvh6X1BKPM5ytAFLolyC++9Xkaa1YCOQUwG2uNQo/uU+TK1knf3pJo8gT"
                + "Ao78ECa8metlWI6p84sTjsi86NJlOjRdZfxpXk7riGiuxmmoC/3DTvHE53ev6"
                + "BNlpaju8XvQkdTqKfRHl+VTvErDvSepUglr2CK7ChDXn/osnUTdr9T2EhUrda"
                + "oRngsWxU2WF3MMFbeueE8e8vzztvSKMB/XCUnUUycn3KxJFo9EQOuaNtca78f"
                + "yFY0VMaDA3v8VaF8tEG5+v2CqvoLXPp9uw06cTfGY2VDUamCCU8Fr5U6jKk6l"
                + "X+bABJNjA1zsuspaJgioZE0HiKT11kJcBufp5LA4mgr6WYqEQvPt4KBZmgg1F"
                + "H4Y/k2WUhNzwshH0YhUP8kumcAhBWAk2Wm+0818oBENm1xEEPcjpXpJRFtKVQ"
                + "RFckP24t5SSmgmqZUCCRPYg+bhw+CQ/LOAihAlmivkaFWVUUtAyflXjARNM1D"
                + "ggGpELS6XXhDT1hhls/1kRreEGrJbUjBfrioOFoBIKkMGBQCE9J6CMggTfiYV"
                + "aktPV0G8fS1OY+Bq/FXaCipySgUZMnsJVsJpIDEFl/2TgJG7EKSSjQqbd+liW"
                + "y8NhK+JwOCyXZQPZBqEIKq4IGRSxyjHFGDVTJCvaIooi1iF64vm/Kb8LHJEEV"
                + "QkbMryzuJjZiLxF2t95UEA+3w9LUFE27DxgYJK2oiNiptpeefpeA3iCirGm7u"
                + "OSoib7J3pUedLMVbKvD6rAYBzoVWomqIsDK/HLUfegR0oB272G/17Fd4SsFIH"
                + "WZHP7oKUzQeXTORszKUeJcBoo+OODpnKjB9bWkWoTv89H6ocvaQruas0khw2h"
                + "qT6DU5XSDVMA3n4WV4L/UmkWXA2GOCyMLbyc2rLf5j+WKN7dGcUwdyeoWGxHX"
                + "VOKMo4UgGK33hX9BVtjisDJHiYIh93SUqJue9+5OKxxkf0GVeZ+B39leruYB3"
                + "T0usSPE9mDimb6GhwbrGU0/2OPYgiCmA4JLSVRcyEoC6nNVJxJswRBjD2pQDi"
                + "LweyJOE4nMd04zH568ntaRkcSLNqRBuoSQ0k6ypLLUjdPJwFUfHGUPC88QUmv"
                + "2bRwAH7N4KFJlOYCb/RFI22de0jLewU4CtEWgZ+hj6vwZzYhLcIwhDLbD0FMH"
                + "bZpXHRwIIZgJnOQvRCjAWuS1JlhexafmA87uTAUzS3FFoNthWXIbIfHXBgSxm"
                + "mS1+dzHe9PnDooYXj/RRosdiGKLptVP6VohmyVbUXTvT7gJxI2yqLeR+/ri4+"
                + "2e+xIhpRUagyGiqteY4djI3EhEhzBVMhiIXbneBfcP6EbXbPydGeFHoaTfe/n"
                + "vR5oSKOICxGZERT9BIRkJ3/I/pD0kWWXSuNYFmDKgtPTPcmuLdoH3hucYHUgx"
                + "p/0gWIorl2bNRyOApo85lgZL0YJDLe3UrtPuzt65ZTvQbpWAYnKHJnKED2ayH"
                + "3sFqTrclvvF6CIum9Suns1C+e/QKPcNGaQMoO9H7BlnYgDRv2F+6wjsV1Yw+E"
                + "hxc3iJiBqO1hM71g9mgZ5rMWmQV1vPm98nBCp4fvlkisPzFvEBhUi5r5RtRSi"
                + "scAkBlYExupjxjZG6/eRGj1MBZ9iyhnlmYrZHcwfmHyaT55Md2bRAaas+8NxS"
                + "iRziJl0A8PPOTM4WSiMzsTQMIfSssIYREmsEQsXZvjR/Gqlv+7Hp+M/2E81MR"
                + "QNImofUTL4iN/DDN9TmNtd7Kh1gCvwd0alLip/zE6uqHwR5gWOnt77DUt7+MF"
                + "yy7NM2SKXrFILKaE/hmHUhROIPeBXCBND0mwcufg7jM8nRiMIDwNm2Ik4YvOp"
                + "W7EP0JkzMRRqa1C1mKJbitiTARl2YTkqCdDtUEI2xcjw3v9URmRuDME8TSekW"
                + "0wk32n5HBBT49aC4JiiHGlfDLvA6w78u8wgM3+On2T40lIFzlt7iSlU1mBkKE"
                + "ppQIadVkMVKrzdLWjRohli1uHVTZeCDF/eBWqT+2Oqh6xDV116cbOHEMNOd1y"
                + "QDF8fPwH+2cRQ/B3GHopWF1HfAMlV5+VnyLTvS1yu+p8bGQrrAOXTOPqlIMPS"
                + "jeHrYwK7/kaGrn6p6IIgUm02hoDYeWToHFs4xoc2KcVua7ycfEhKDevLOT6Uk"
                + "gL2HDLE8OXSoDyaFi/DBGkag450TbtI3m9kr2mEGP7JC5i671F4TRJkLQwMnf"
                + "M0OzexNtpoMHXfw+tN4NMMDJ1zbeJLMMoXWmgnXbMHEK/1cIS8NgND53ypJCi"
                + "IulTQ80413XNghn8Pg7YUTQwzt6SE8hcIgwgqy5NDArETFkCVGhm671uIlVQI"
                + "ufZSi/Eq8ITDaZjhgL0nUVIQ2tcHw+7bg4GIwR4O2D8UzQVCmfpg2B05Ah0gg"
                + "08zYA9YmnZ7vOWBYXe8+AhnE2GGA/bx5Wq4EAy7MBTSM0aGkn3BEZRCOnu933"
                + "iGnTrT9POzM5TqabCF0JVLTdR4hu/aUUPOCh67UwFXh6NLXdtohrzTDqbMMcx"
                + "QqqNENzkTB221+eMYfprnHk0eEMzQaaxviF6NtaIGX9emGfjqPfLC6AGBDMth"
                + "9aXVBDXCJLmdlB7IhCdvsUr1rZetDEW326FGWKrztpXU4Biy1odfn5O2w/wTE"
                + "WfxZ9mklk1ikOHQw13SyT6LmKIYRp3CSh+3eJ9k+3orDmdnO2YKSdJjQGXiE9"
                + "IuqUVMMQwtraVKayYAGoTLQOFXWjQUgqHl3YhCFOgJ0rEJpypDaSGakzWYOSS"
                + "GVtilTskiGUqxiNO5J2kfDz7/1wJXBU2gdu2PBPf3eoZSSZvb2TX8+UNsnXdj"
                + "+nqhTbG9I6+o0Ye26+FCqpwhNS0jfK0+oSw+vHMGxaPK8Dco6RlKhQ0Op56eQ"
                + "J8Ddjpv0VhBTpLrNbtb7w1EMJQ2X51buEgHUE2R/oAzM87nSQCG0iw4n+WWC7"
                + "UMcTDQetMzdAzlo9zuzWWwPRUCMdTIoBRtDeipgO2LgWqZMJ5hfw7lvhiueqa"
                + "FVEYH9zYJw5D3s5rje5vIhg7MYjkc7RkOTeNpuYplWLsvSVVBHkO/Ufv7L+Dj"
                + "3W6I6EpjkKUKiIHdvpQuPtocSK9R+4dfXS794LDUyI+cWh3a7EvuhqCrHjI0z"
                + "Jm4uZuUlxt8aELp19bPEeygNchGNqS0Qm53OLhfm9L/qLcPVUCuyeQEZUdqRB"
                + "MrpW+i4jZ8j6BSGT+midVN7n0pyWkBeZds8g6SlfTlo1H3XMpNJsW+e+AM+j4"
                + "N1sdOVuDjbkkoFa/z8xZIyUxPUO3tOfIQqFyF9d5sduzK5RW5fkhDoYR/9M//"
                + "A53RAASVexrGn3LdymSe1/TAPZ2mJ6hs4PjoqqqUTzZW8ZsElTIyL2/spSnAQ"
                + "z4BCP5TNnD8nMRWLygBK0ICEFQFylOLeFy3rhCXBymH4Hzdb4FrlBSCYKyqcG"
                + "9PBqPAsARrhaDP1sbqUvwJgn4vs7a0LAtBcKMQ9H1Pg/EkbwgtmisEB6SAzej"
                + "duxaY4LVno7zfBgPfp+H9a/bRL2SgE1xEAflqAQiue8H2NB3i9V2PAtxb0r/+"
                + "dKprOjVX5S4W98lvR4p7wjPdVauay3KRdcfDsbv3DNWUl6xrKE581aPuPuBJb"
                + "2TSCCo7TXcvhPZO5wkvPG6h24lRu7B7Q6Wp1Jj20uoWunM7bDHFa493zascur"
                + "AOhrbKju9978QUF439/dTbToo00dbCGgq7BryjXmm+I0tCXdyX69wbRofsNGu"
                + "RnrWlUkFuAX9Bfyqt4ehDVotaXysV6BbwF/qe4h9HHo/VBOtcJ5/tEgx2WdEf"
                + "0qs+1iC6Pp54HBKglI9PvmPXxxYYC4l4jDtgpaLMOZCpJEFvlnyjSMDdCxrFr"
                + "hayjBnYc5BOXRUA4gZXhxLKrzfsyllv9xxuqUhC3kqoorgaknCEUZ6dl2YbXT"
                + "yqfcRNhZj+nQk3lObTvqSZS57k58NjLY8z3R2Xt82V2MpM6WnYmvaJyn6DBWE"
                + "RbZhGi/uzsfD9RNpLaYx9TP/A6Kg9el/Qe1ge4NkTHINiMwFHwjffXYAyIE9r"
                + "MBh0fOF7SM+wPXMFoaT6FfmUALpcjvzGOX7TYleTkRNJKKtDXm4+AI1zOZhkY"
                + "zzzydMwPlDGxOil6NkxTpyd2S9iXWUOh2Ke/l0VOP7zgGN1eTplxp3HlhzZV+"
                + "hj5j+H4nHbZM9LyxiTGnSzxpHjnGXxrfw1uzcErZu9reo4z/f763W/z+P6vD0"
                + "8dj9p82bMmDFjxowZM2bMmDFjxoz/T/wPcKqtaCSHCKsAAAAASUVORK5CYII=";
    }

    public static String getNoPhoto() {
        return "data:image/png;base64," + getBase64NoPhoto();
    }

    public static byte[] getByteNoPhoto() {
        return Base64.getDecoder().decode(getBase64NoPhoto());
    }

}
