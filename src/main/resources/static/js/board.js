const app = window.app || {
    Elmt: {},
    Act: {},
}


$(()=>{
    fn_bindEvent();
    app.Elmt.init();
    app.Act.init();
})


app.Act = (() => {
    var self;

    return {
        init: function() {
            self = this;
            self.getBoard();
        },
        getBoard: function() {
            $.ajax(
                {
                    url: '/boards',
                    type: 'post',
                    dataType:'text',
                    success: function (fragment) {
                        $("div.board-list-container").replaceWith(fragment);
                    },
                },
            )
        }
    }
})();

app.Elmt = (() => {
    return {
        init: ()=> {

        }
    }
})();


const fn_bindEvent = () => {

}